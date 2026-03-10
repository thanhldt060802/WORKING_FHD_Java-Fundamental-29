import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // ArrayList<String> list = new ArrayList<>();
        // list.add("C#");
        // list.add("Java");
        // list.add("C++");
        // list.add("Ruby");
        // list.add("Golang");
        // System.out.println(list);

        // Integer n = 100;
        // list.remove("C++");
        // list.remove(n);
        // System.out.println(list);

        // System.out.println(list.indexOf("Ruby"));

        // System.out.println(list.contains("Golang"));

        // Integer x = 100;
        // String y = "ABC";
        // System.out.println(x.equals(y));

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // System.out.println();
		// students.remove(new Student("S02"));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // Student s1 = new Student("S01", "A", 19);
        // Student s2 = new Student("S02", "Asdfmvbidsjfmlbksd", 191231);

        // System.out.println(s1.equals(s2));

        // List<String> ll = new LinkedList<>();
        // Integer[] x = new Integer[100];
        // System.out.println(Arrays.toString(x));

        Stack<String> stack = new Stack<>();
        stack.push("C#");
        stack.push("Java");
        stack.push("C++");
        stack.push("Ruby");
        stack.push("Golang");
        // for(String s : stack) {
		// 	System.out.println(s);
		// }
        // while(!stack.isEmpty()) {
		// 	System.out.println(stack.pop());
		// }
        System.out.println(stack.peek());

    }

}
