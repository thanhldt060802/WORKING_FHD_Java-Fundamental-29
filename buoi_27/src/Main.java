import app.ATM;
import app.ATMMenu;
import filehandling.ObjectFileHandling;
import filehandling.TextFileHandling;

public class Main {

    public static void main(String[] args) {

        TextFileHandling fileHandling1 = new TextFileHandling("data/accounts.txt");
        // ObjectFileHandling fileHandling2 = new ObjectFileHandling("data/accounts.dat");

        ATM atm = new ATM(fileHandling1);

        // System.out.println("Before action:");
        // atm.showAllAccounts();

        // atm.addAccount(new Account("tuanhung", "abc123", 50000000));
        // atm.addAccount(new Account("tanthanh", "abc123", 70000000));
        // atm.addAccount(new Account("ngocminh", "abc123", 60000000));
        // atm.updateAccount(new Account("tuanhung123", "xyzABC", 100000000));
        // atm.removeAccountById("tuanhung");

        // System.out.println("After action:");
        // atm.showAllAccounts();

        // System.out.println(atm.searchAccountById("tanthanh123"));

        // System.out.println("Before action:");
        // atm.showAllAccounts();

        // atm.login("tanthanh", "abc123");

        // atm.recharge(10000000);

        // atm.logout();

        // atm.login("tuanhung", "abc123");

        // atm.recharge(5000000);

        // atm.withdraw(100000000);

        // atm.transfer("tuanhung123", 20000000);

        // System.out.println("After action:");
        // atm.showAllAccounts();

        // ATMMenu.showAdminMenu(atm);
        ATMMenu.showUserMenu(atm);

    }

}
