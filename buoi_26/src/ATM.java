import java.util.ArrayList;

public class ATM implements AccountManagement, ATMFunction {

    private ArrayList<Account> accountList;
    private DataFileHandling dataFileHandling;
    private Account inUsing;

    public ATM(DataFileHandling dataFileHandling) {
        this.dataFileHandling = dataFileHandling;
        this.accountList = new ArrayList<Account>();

        this.dataFileHandling.loadData(this.accountList);
    }

    public void showAllAccounts() {
        for (Account acc : this.accountList) {
            System.out.println(acc);
        }
    }

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

    public Account searchAccountById(String id) {
        for (int i = 0; i < this.accountList.size(); i++) {
            if (Account existingAcc : this.accountList) {
                return existingAcc;
            }
        }

        return null;
    }

    public void login(String id, String pin) {
        for (Account existingAcc : this.accountList) {
            if (existingAcc.getId().equals(id) && existingAcc.getPin().equals(pin)) {
                this.inUsing = existingAcc;
                System.out.println("Login account success!");
                return;
            }
        }

        System.out.println("Login account failed, wrong id or pin!");
    }

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

    public void logout() {
        if (this.inUsing == null) {
            System.out.println("Logout account faield, no account logged in!");
            return;
        }

        this.inUsing = null;
        System.out.println("Logout account success!");
    }
    
}
