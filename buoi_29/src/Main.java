import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {

        // MysteriousBox<String> box = new MysteriousBox<>("Hello world!");
		// System.out.println(box);
		// System.out.println(box.getValue());
		// box.setValue("Goodbye world!");
		// System.out.println(box);
		// System.out.println(box.getValue());

        // MysteriousBox<Student> box = new MysteriousBox<Student>(new Student("S01", "A", 29));
		// System.out.println(box);
		// System.out.println(box.getValue());
		// box.setValue(new Student("S02", "B", 21));
		// System.out.println(box);
		// System.out.println(box.getValue());

        // ManagementSystem<Student> ms = new ManagementSystem<Student>();
		// System.out.println("After initing:");
		// ms.showAll();
		
		// System.out.println();
		
		// ms.add(new Student("S01", "A", 29));
		// ms.add(new Student("S02", "A", 21));
		// ms.add(new Student("S03", "A", 24));
		// ms.add(new Student("S01", "D", 19));
		// System.out.println("After adding some student:");
		// ms.showAll();
		
		// System.out.println();
		
		// ms.update(new Student("S01", "X", 100));
		// System.out.println("After updating a student:");
		// ms.showAll();
		
		// System.out.println();
		
		// ms.remove(new Student("S01"));
		// System.out.println("After removing a student:");
		// ms.showAll();
		
		// System.out.println();
		// System.out.println("After searching a student:");
		// System.out.println(ms.search(new Student("S02")));

        // MysteriousBox<String> box = new MysteriousBox<String>("abc");
        // System.out.println(box.equalsByType(new Student("S01", "A", 29)));
        // System.out.println(box.equalsByType("Hello"));

        // UtilMethods<String> methods = new UtilMethods<>();
        // methods.print("asdasd");
        // methods.print(10);

        // UtilMethods.print("sda");
        // UtilMethods.print(10);
        // UtilMethods.print(new Student("S01", "A", 29));

        // NumberBox<Number> box = new NumberBox<>((byte)10);

        // MysteriousBox<? extends Number> box = new MysteriousBox<Number>(10);
        // box.setValue(10);
        // Number x = box.getValue();

        // Object str = new String("asdasD");
        // Number n = new Long(10);
        // Number n = new Integer(0);

        // MysteriousBox<? super Integer> box = new MysteriousBox<>(10);
        // box.setValue(100);
        // box.setValue(n);

		
        
    }

}
