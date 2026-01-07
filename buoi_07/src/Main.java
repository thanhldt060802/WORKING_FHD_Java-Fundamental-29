import java.util.Arrays;
import java.util.Scanner;
import common.util.Inputer;

public class Main {

    public static void main(String[] args) {
        
        // String result = Inputer.inputString();
        // int result = Inputer.inputInt();
        // System.out.println("My input: " + result);

        int result1 = Inputer.inputInt("Input an integer: ");
        System.out.println("My input: " + result1);
        String result2 = Inputer.inputString("Input a string: ");
        System.out.println("My input: " + result2);

        // int[] arrVar = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		// System.out.println(Arrays.toString(arrVar));
		// // f(arrVar);  // arrParam = arrVar
        // int[] result = reverse(arrVar.clone());
		// System.out.println(Arrays.toString(arrVar));
        // System.out.println(Arrays.toString(result));

        // int x = 100;
        // System.out.println(x);
        // f(x);
        // System.out.println(x);

        // Integer x = 100;
        // System.out.println(x);
        // f(x);
        // System.out.println(x);
        
        // int[] arrVar = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		// System.out.println(Arrays.toString(arrVar));
		// f(arrVar);  // arrParam = arrVar
		// System.out.println(Arrays.toString(arrVar));

        // f(10, 20);
        // f(3.14, 10);

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        // f(arr);
        // f(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // f(1, "Hello", "Java", "Fullhouse Dev");

    }

    // public static void f(int a, String ...arr) {
    //     System.out.println("a: " + a);
    //     System.out.println("arr: " + Arrays.toString(arr));
    // }

    // public static void f(int ...arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }

    // public static void f(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }

    // public static void f(int a) {
	// 	System.out.println(a);
	// }
	
	// public static int f(int a, int b) {
	// 	return a + b;
	// }

    // public static double f(double x1, int x2) {
    //     return x1 + x2;
    // }

    // public static double f(int a, double b) {
	// 	return a + b;
	// }
	
	// public static double f(double a, int b) {
	// 	return a - b;
	// }

    // public static void f(int[] arrParam) {
    //     arrParam = new int[] {1, 2, 3};
    // }

    // public static void f(Integer a) {
    //     a = 10;
    // }

    // public static void f(int a) {
    //     a = 10;
    // }

    // public static void f(int[] arrParam) {
	// 	arrParam[1] = 100;
	// }

    // public static int[] reverse(int[] arrParam) {
    //     // int[] arrCopy = arrParam.clone();
    //     // for (int i = 0; i < arrCopy.length / 2; i++) {
    //     //     int temp = arrCopy[i];
    //     //     arrCopy[i] = arrCopy[arrCopy.length - 1 - i];
    //     //     arrCopy[arrCopy.length - 1 - i] = temp;
    //     // }

    //     for (int i = 0; i < arrParam.length / 2; i++) {
    //         int temp = arrParam[i];
    //         arrParam[i] = arrParam[arrParam.length - 1 - i];
    //         arrParam[arrParam.length - 1 - i] = temp;
    //     }
    //     return arrParam;
    // }
    
}
