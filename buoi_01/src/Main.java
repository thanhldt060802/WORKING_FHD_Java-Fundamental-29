public class Main {

    public static void main(String[] args) {

        // System.out.println("Hello, World! 1");
        // System.out.println("Hello, World! 2");
        // System.out.println("Hello, World! 3");
        // System.out.println("Hello, World! 4");

        // System.out.print("Hello, \nWorld! 1\n");
        // System.out.print("Hello, World! 2");
        // System.out.print("Hello, World! 3");
        // System.out.print("Hello, World! 4");

        // System.out.println("Hello world!");
        // System.out.println("Hello \"world\"!");

        // String myName = "Thành";
        // int myAge = 19;
        // double myHeight = 1.75;
        // double myWeight = 59.99;

        // System.out.printf("My name is %s, I am %d years old, I am %.1f meters tall.", myName, myAge, myHeight, myWeight);

        // System.out.printf("|%20s|", "Thành");
        // System.out.println();
        // System.out.printf("|%20s|", "Thành");
        // System.out.println();
        // System.out.printf("|%20s|", "Thành");
        // System.out.println();
        // System.out.printf("|%20s|", "Thành");
        // System.out.println();
        // System.out.printf("|%20s|", "Thành");
        // System.out.println();
        // System.out.printf("|%20s|", "Thành");

        // int myVariable; // Khai báo
        // myVariable = 10; // Khởi tạo giá trị

        // int myVariable = 10; // Định nghĩa biến
        
        // System.out.println(myVariable * 10);

        // byte var1 = 10;
		// short var2 = 100;
		// int var3 = 1000;
		// long var4 = 9000000000L;  // Khi sử dụng giá trị số nguyên trong phạm vi của int sẽ không cần thêm ký tự mở rộng 'L' ở cuối số
		// float var5 = 3.14F;
		// double var6 = 3.14;  // Không cần thêm ký tự mở rộng 'D' ở cuối số
		// char var7 = 'Z';
		// boolean var8 = true;

        // float var5 = 1.0f / 3;
		// double var6 = 1.0 / 3;
        // System.out.printf("%.20f", var5);
        // System.out.println();
        // System.out.printf("%.20f", var6);

        // int a = 20;
        // int b = 15;

        // boolean check = a < b;
        // System.out.println(check);

        // int a = 10; // Biến tham trị (Biến nguyên thuỷ)
        // int b = 10;

        // Integer x1 = 10; // Biến tham chiếu (Biến đối tượng)
        // Integer x2 = 10;

        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);

        // String name = "Le Dao Tan Thanh";
        // String name = new String("Le Dao Tan Thanh");

        System.out.println(System.identityHashCode(x1));
        System.out.println(System.identityHashCode(x2));

        System.out.println(x1 == x2);

    }

}
