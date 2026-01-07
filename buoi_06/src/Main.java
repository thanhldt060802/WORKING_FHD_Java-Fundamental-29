public class Main {

    public static void main(String[] args) {

        // int result = sumWithReturn(100, 200);
        // System.out.println(result);
        // System.out.println(sumWithReturn(19, 20));

        // System.out.println("main: " + sumWithReturn(20, 50));

        // String result = greeting("Thanh", 23, 1.78);
        // System.out.println(result);

        // int[] myArr = new int[] {2, 4, 6, 8, 10, 12, 14, 13};
        // double result = average(myArr);
        // System.out.println(result);

        // String result = validateDigitString("13954.81205981");
        // System.out.println(result);

        // validateDigitString("18919471512");

        test(10);

    }

    // public static int sumWithReturn(int a, int b) {
    //     // int z = a + b;
    //     // return z;
    //     // System.out.println("sumWithReturn: " + (a + b));
    //     return a + b;
    // }

    // public static void sumNonReturn(int a, int b) {
    //     System.out.println(a + b);
    // }

    // public static void greeting(String name, int age, double height) {
	// 	String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
	// 	System.out.println(str.formatted(name, age, height));
	// }

    // public static String greeting(String name, int age, double height) {
    //     System.out.println("Hello");
	// 	String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
	// 	return str.formatted(name, age, height);
	// }

    // public static double average(int[] arr) {
	// 	int sum = 0;
	// 	for(int element : arr) {
	// 		sum += element;
	// 	}
	// 	return (double)sum / arr.length;
	// }

    // public static String validateDigitString(String str) {
    //     if (str == null || str.isEmpty()) {
    //         return "Invalid string";
    //     } else {
    //         for (char c : str.toCharArray()) {
    //             // if (!Character.isDigit(c)) {
    //             //     return "This is not a number series";
    //             // }
    //             if (c < '0' || c > '9') {
    //                 return "This is not a number series";
    //             }
    //         }
    //         return "This is a number series";
    //     }
    // }

    // public static void validateDigitString(String str) {
    //     if (str == null || str.isEmpty()) {
    //         System.out.println("Invalid string");;
    //     } else {
    //         for (char c : str.toCharArray()) {
    //             if (c < '0' || c > '9') {
    //                 System.out.println("This is not a number series");
    //                 // break;
    //                 return;
    //             }
    //         }
    //         System.out.println("This is a number series");
    //     }
    // }

    // Nếu n là số chia hết cho 2 thì trả về n / 2, nếu n là số chia hết cho 3 thì trả về n / 3
    public static int test(int n) {
        // if (n % 2 == 0) {
        //     return 1;
        // }
        // if (n % 3 == 0) {
        //     return 2;
        // }

        // return -1;

        if (n % 2 == 0) {
            return 1;
        } else if (n % 3 == 0) {
            return 2;
        }

        return -1;
    }

}
