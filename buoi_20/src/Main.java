import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // // Reader reader = new Reader();
        // MySqlReader mySqlReader = new MySqlReader();
        // FileExcelReader fileExcelReader = new FileExcelReader();

        // // testRead(reader);
        // testRead(mySqlReader);
        // testRead(fileExcelReader);

        // Shape2D shape2d = new Triangle("Hinh A", 3, 4, 5);
        // show(shape2d);
        // shape2d = new Rectangle("Hinh B", 10, 20);
        // show(shape2d);

        // Triangle triangle = new Triangle("Hinh A", 3, 4, 5);
        // show(triangle);
        // Rectangle rectangle = new Rectangle("Hinh B", 10, 20);
        // show(rectangle);

        /**
         * class abstract A {
         *      abstract method x1;
         *      abstract method x2;
         *      abstract method x3;
         * }
         * 
         * class abstract B extends A {
         *      abstract method y1;
         *      abstract method y2;
         *      @Override method x2;
         * }
         * 
         * class abstract C extends B {
         *      @Override method x1;
         *      @Override method y2;
         *      abstract method z1;
         *      abstract method z2;
         *      method z3();
         * }
         * 
         * class Test extends C {
         *      z1
         *      z2
         *      y1
         *      x3
         * }
         */

        // MySqlReader mySqlReader = new MySqlReader();
        // MySqlWriter mySqlWriter = new MySqlWriter();

        // testRead(mySqlReader);
        // testWrite(mySqlWriter);

        MySqlAdapter mySqlAdapter = new MySqlAdapter();
        testReadV2(mySqlAdapter);
        testWriteV2(mySqlAdapter);

    }

    public static void testRead(Reader reader) {
        reader.read();
    }

    public static void testWrite(Writer writer) {
        writer.write();
    }

    public static void testReadV2(IReader reader) {
        reader.read();
    }

    public static void testWriteV2(IWriter writer) {
        writer.write();
    }

    public static void show(Shape2D shape2d) {
        System.out.println(shape2d);
        System.out.println("C = " + shape2d.calculatePerimeter());
        System.out.println("S = " + shape2d.calculateArea());
    }

}
