package entities;

import java.util.Date;

public class LockingAccount {

    private String accountId;
    private int count;
    private Date timeUnlock;
    
    public LockingAccount(String accountId) {
        this.accountId = accountId;
        this.count = 1;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getTimeUnlock() {
        return timeUnlock;
    }

    public void setTimeUnlock(Date timeUnlock) {
        this.timeUnlock = timeUnlock;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "LockingAccount [accountId=" + accountId + ", count=" + count + ", timeUnlock=" + timeUnlock + "]";
    }
    
}
