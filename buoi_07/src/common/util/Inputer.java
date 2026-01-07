package common.util;

import java.util.Scanner;

public class Inputer {

    private static Scanner sc = new Scanner(System.in);

    public static String inputString(String message) {
        System.out.print(message);
        String input = sc.nextLine();
        return input;
    }

    public static int inputInt(String message) {
        while(true) {
            try {
                System.out.print(message);
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please re-input!");
            }
        }
    }

    // Nhập long ???

    // Nhập double ???
    
}
