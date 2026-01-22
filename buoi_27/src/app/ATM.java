package app;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import entities.Account;
import entities.LockingAccount;
import filehandling.DataFileHandling;

public class ATM implements AccountManagement, ATMFunction {

    private ArrayList<Account> accountList;
    private ArrayList<LockingAccount> lockingAccountList;
    private DataFileHandling dataFileHandling;
    private Account inUsing;

    public ATM(DataFileHandling dataFileHandling) {
        this.dataFileHandling = dataFileHandling;
        this.accountList = new ArrayList<Account>();

        this.dataFileHandling.loadData(this.accountList);
    }

    @Override
    public void showAllAccounts() {
        for (Account acc : this.accountList) {
            System.out.println(acc);
        }
    }

    @Override
    public void addAccount(Account acc) {
        for (Account existingAcc : this.accountList) {
            if (existingAcc.getId().equals(acc.getId())) {
                System.out.println("Add account failed, duplicate account id!");
                return;
            }
        }

        this.accountList.add(acc);
        System.out.println("Add account success!");

        this.dataFileHandling.saveData(this.accountList);
    }

    @Override
    public void updateAccount(Account acc) {
        for (int i = 0; i < this.accountList.size(); i++) {
            if (this.accountList.get(i).getId().equals(acc.getId())) {
                this.accountList.set(i, acc);
                System.out.println("Update account success!");

                this.dataFileHandling.saveData(this.accountList);
                return;
            }
        }

        System.out.println("Update account failed, account not found!");
    }

    @Override
    public void removeAccountById(String id) {
        for (int i = 0; i < this.accountList.size(); i++) {
            if (this.accountList.get(i).getId().equals(id)) {
                this.accountList.remove(i);
                System.out.println("Remove account success!");

                this.dataFileHandling.saveData(this.accountList);
                return;
            }
        }

        System.out.println("Remove account failed, account not found!");
    }

    @Override
    public Account searchAccountById(String id) {
        for (Account existingAcc : this.accountList) {
            if (existingAcc.getId().equals(id)) {
                return existingAcc;
            }
        }

        return null;
    }

    @Override
    public void login(String id, String pin) {
        for (Account existingAcc : this.accountList) {
            if (existingAcc.getId().equals(id)) {
                LockingAccount foundLockingAccount = null;
                for (LockingAccount existingLockingAccount : this.lockingAccountList) {
                    if (existingLockingAccount.getAccountId().equals(id)) {
                        foundLockingAccount = existingLockingAccount;
                        int currentCount = existingLockingAccount.getCount();
                        foundLockingAccount.setCount(currentCount + 1);
                    }
                }

                if (existingAcc.getPin().equals(pin)) {
                    this.inUsing = existingAcc;
                    this.lockingAccountList.remove(foundLockingAccount);
                    System.out.println("Login account success!");
                    return;
                } else {
                    if (foundLockingAccount == null) {
                        foundLockingAccount = new LockingAccount(id);
                        this.lockingAccountList.add(foundLockingAccount);
                    }

                    if (foundLockingAccount.getCount() >= 3) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(System.currentTimeMillis() + 30000);
                        foundLockingAccount.setTimeUnlock(calendar.getTime());
                    }
                }
            }
        }

        System.out.println("Login account failed, wrong id or pin!");
    }

    @Override
    public void recharge(int money) {
        if (this.inUsing == null) {
            System.out.println("Recharge money failed, no account logged in!");
            return;
        }

        int currentBalance = this.inUsing.getBalance();
        this.inUsing.setBalance(currentBalance + money);
        System.out.println("Recharge money success!");

        this.dataFileHandling.saveData(this.accountList);
    }

    @Override
    public void withdraw(int money) {
        if (this.inUsing == null) {
            System.out.println("Withdraw money failed, no account logged in!");
            return;
        }

        int currentBalance = this.inUsing.getBalance();
        if (currentBalance < money) {
            System.out.println("Withdraw money failed, not enough money!");
            return;
        }

        this.inUsing.setBalance(currentBalance - money);
        System.out.println("Withdraw money success!");

        this.dataFileHandling.saveData(this.accountList);
        return;
    }

    @Override
    public void transfer(String id, int money) {
        if (this.inUsing == null) {
            System.out.println("Transfer money failed, no account logged in!");
            return;
        }

        for (Account existingAcc : this.accountList) {
            if (existingAcc.getId().equals(id)) {
                int currentBalance = this.inUsing.getBalance();
                if (currentBalance < money) {
                    System.out.println("Transfer money failed, not enough money!");
                    return;
                }

                this.inUsing.setBalance(currentBalance - money);
                
                int currentReceiverBalance = existingAcc.getBalance();
                existingAcc.setBalance(currentReceiverBalance + money);

                System.out.println("Transfer money success!");

                this.dataFileHandling.saveData(this.accountList);
                return;
            }
        }

        System.out.println("Transfer money failed, transfer account not found!");
    }

    @Override
    public void logout() {
        if (this.inUsing == null) {
            System.out.println("Logout account faield, no account logged in!");
            return;
        }

        this.inUsing = null;
        System.out.println("Logout account success!");
    }

    @Override
    public boolean checkLockingAccount(String accountId) {
        for (LockingAccount existingLockingAccount : this.lockingAccountList) {
            if (existingLockingAccount.getAccountId().equals(accountId) && existingLockingAccount.getTimeUnlock() != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                Date now = calendar.getTime();
                if (existingLockingAccount.getTimeUnlock().before(now)) {
                    this.lockingAccountList.remove(existingLockingAccount);
                    return false;
                } else {
                    return true;
                }
            }
        }

        return false;
    }
    
}
