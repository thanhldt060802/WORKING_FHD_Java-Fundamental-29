package app;

import common.util.Inputer;

public class ATMMenu {
    
    public static void showAdminMenu(AccountManagement accMangement) {

    }

    public static void showUserMenu(ATMFunction atmFunction) {
        while(true) {
            System.out.println("-------------------------");
            System.out.println("1 -> Login");
            System.out.println("2 -> Recharge");
            System.out.println("3 -> Withdraw");
            System.out.println("4 -> Transfer");
            System.out.println("5 -> Logout");
            System.out.println("6 -> Exit");
            int choice = Inputer.inputInt("Your choice: ");
            switch (choice) {
                case 1: {
                    String id = Inputer.inputString("Enter account id: ");
                    if (atmFunction.checkLockingAccount(id)) {
                        System.out.println("Your account is locked! Try again later...");
                        break;
                    }
                    String pin = Inputer.inputString("Enter account pin: ");
                    atmFunction.login(id, pin);
                    break;
                }
                case 2: {
                    int money = Inputer.inputInt("Enter money: ");
                    atmFunction.recharge(money);
                    break;
                }
                // Define additional cases
                case 6: {
                    System.out.println("Goodbye!");
                    return;
                }
                default: {
                    System.out.println("Your choice invalid, please re-input!");
                }
            }
        }
    }

}
