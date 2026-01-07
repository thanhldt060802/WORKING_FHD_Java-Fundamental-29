public class Main {

    public static void main(String[] args) {

        // int a = 10;
        // System.out.println(a);
        // System.out.println(a * 99);
        
        // Integer a1 = 10;
        // System.out.println(a1);
        // System.out.println(a1 * 99);
        // a1.

        // String a2 = "Thành";
        // a2.

        // int a = 7;
        // int b = 4;
        // System.out.println(a / (double)b);

        // int a = 10;
        // System.out.println(a);
        // System.out.println((double)a);

        // double pi = 3.14;
        // System.out.println(pi);
        // System.out.println((int)pi);

        // int a = 78;
        // System.out.println((char)a);

        // double a = 87.78;
        // System.out.println((char)a);

        // char myChar = 'I';
        // System.out.println((int)myChar);

        // char myChar = 'à';
        // System.out.println((int)myChar);

        // int a = 224;
        // System.out.println((char)a);

        // Object a = new Integer(10);
        // // Number temp = (Number)a;
        // // Integer temp = (Integer)a;

        // // System.out.println(temp * 99);

        // Double temp = (Double)a;

        // int a = 7;
        // int b = 4;
        // System.out.println(a / b);
        // System.out.println(a % b);

        // int a = -10;
        // System.out.println(a + 15);

        /*
         * ... -3, -2, -1, 0, 1, 2, 3, ....
         */
        // int a = 16;
        // System.out.println(~a); // -17
        // int b = -16;
        // System.out.println(~b); // 15

        // boolean result = 5 > 10;
        // System.out.println(!result);

        // int a = 10;
        // // System.out.println(15 + ++a); // 26
        // // System.out.println(15 + a++); // 25
        // // System.out.println(15 + ++a + a); // Phép toán 1: 15 + ++a <=> 15 + 11 = 26 (1)
        // //                                   // Sau khi phép toán 1 kết thúc thì a đã trải qua một lần ++ => a = 11
        // //                                   // Phép toán 2: (1) + a <=> 26 + 11 = 37
        // System.out.println(15 + a++ + a); // Phép toán 1: 15 + a++ <=> 15 + 10 = 25 (1)
        //                                   // Sau khi phép toán 1 kết thúc thì a đã trải qua một lần ++ => a = 11
        //                                   // Phép toán 2: (1) + a <=> 25 + 11 = 36
        // System.out.println(a);

        // int a = 20; // Chuyển a từ decimal về binary => a = 10100 << 2 = 1010000 sau đó convert ngược lại
        // // System.out.println(a << 2);
        // // System.out.println(a >> 2); // Chuyển a từ decimal về binary => a = 10100 >> 2 = 101 sau đó convert ngược lại
        // System.out.println(a >> 3);

        // int a = 999; // 1111100111
        // int b = 30; // 11001
        /*
         * 1111100111
         * 0000011110
         * 
         * Nhân
         * 0000000110
         * 
         * Cộng
         * 1111111111
         * 
         * Loại trừ
         * 1111111001
         */
        // System.out.println(a & b);
        // System.out.println(a | b);
        // System.out.println(a ^ b);

        int a = 20; // 00010100 => 11101011
        System.out.println(~a);

    }

}
