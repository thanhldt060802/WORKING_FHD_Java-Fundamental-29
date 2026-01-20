public class Main {

    public static void main(String[] args) {

        TextFileHandling fileHandling1 = new TextFileHandling("data/accounts.txt");
        ObjectFileHandling fileHandling2 = new ObjectFileHandling("data/accounts.dat");

        ATM atm = new ATM(fileHandling1);
        atm.showAllAccounts();
        // atm.addAccount(new Account("tuanhung", "dashvbasjdhv", 5000000));

    }

}
