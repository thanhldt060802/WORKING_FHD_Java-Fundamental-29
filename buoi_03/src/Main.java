import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int a = 1;
        // int b = 15;
        // int c = 18;
        // int d = 5;

        // System.out.println(a > b | a > c | a > d);

        // int a = 10;
        // int b = 20;

        // System.out.println(a > b && ++a > 0);
        // System.out.println(a < b && ++a < 0);
        // System.out.println(a > b & ++a > 0);
        // System.out.println(a);

        // System.out.println(a > b || ++a > 0);
        // System.out.println(a < b || ++a > 0);
        // System.out.println(a < b | ++a > 0);
        // System.out.println(a);

        // checkStrEmpty(null);

        // int a1 = 20;
		// int a2 = 20;
		// System.out.println(System.identityHashCode(a1));
		// System.out.println(System.identityHashCode(a2));
        // System.out.println(a1 == a2);
				
		// Integer a3 = new Integer(20);
		// Integer a4 = new Integer(20);
		// System.out.println(System.identityHashCode(a3));
		// System.out.println(System.identityHashCode(a4));
        // System.out.println(a3 == a4);

        // int a = 10;
        // System.out.println(a);
        // // a += 5; // a = a + 5
        // // a <<= 2; // a = a << 2
        // a ^= 18; // a = a ^ 18
        // System.out.println(a);

        // int a1 = 20;
		// int a2 = 20;
		// System.out.println(a1 == a2);
				
		// Integer a3 = new Integer(20);
		// Integer a4 = new Integer(20);
		// System.out.println(a3 == a4);

        // int a1 = 20;
		// int a2 = 20;
		// System.out.println(a1 != a2);
				
		// Integer a3 = new Integer(20);
		// Integer a4 = new Integer(20);
		// System.out.println(a3 != a4);

        // int a = 10;
        // int b = 10;

        // System.out.println(a >= b);

        // int a = 30;
        // int b = 25;
        // String result = a > b ? "Hello" : "World";
		// System.out.println(result);

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter integer number n = ");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // System.out.println(n1 * n1);
        // System.out.println(n2 * n2);
        // System.out.println(n3 * n3);

        // int n4 = sc.nextInt();
        // int n5 = sc.nextInt();
        // System.out.println(n4 * n4);
        // System.out.println(n5 * n5);

        // "13 14 15 16 17\n" n1
        // " 14 15 16 17\n"   n2
        // " 15 16 17\n"      n3
        // " 16 17\n"         n4
        // " 17\n"            n5
        // ""

        // System.out.print("Your age = ");
        // int age = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Your name = ");
        // String name = sc.nextLine();

        // System.out.println();

        // System.out.println(name + ", " + age);

        int a = sc.nextInt();
        String b = sc.nextLine();
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // sc.close();

    }

    public static void checkStrEmpty(String str) {
        if (str != null && str.isEmpty()) {
            System.out.println("This str is empty");
        }
    }

}
