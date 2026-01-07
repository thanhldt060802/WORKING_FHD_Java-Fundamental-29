import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Integer[] myArr = new Integer[] {5, 2, 4, 1, 2, 3, 7, 8, 5, 6};
        // System.out.println("Before sorting:");
        // for (Integer e : myArr) {
        //     System.out.println(e);
        // }
        // Arrays.sort(myArr);
        // System.out.println("After sorting:");
        // for (Integer e : myArr) {
        //     System.out.println(e);
        // }

        // Student[] myArr = new Student[] {
        //     new Student(1L, "A", 29),
        //     new Student(2L, "C", 21),
        //     new Student(3L, "B", 23),
        // };
        // System.out.println("Before sorting:");
        // for (Student e : myArr) {
        //     System.out.println(e);
        // }
        // Arrays.sort(myArr);
        // System.out.println("After sorting:");
        // for (Student e : myArr) {
        //     System.out.println(e);
        // }
        
        // List<Integer> myList = Arrays.asList(5, 2, 4, 1, 2, 3, 7, 8, 5, 6);
        // System.out.println("Before sorting:");
        // for (Integer e : myList) {
        //     System.out.println(e);
        // }
        // Collections.sort(myList);
        // System.out.println("After sorting:");
        // for (Integer e : myList) {
        //     System.out.println(e);
        // }

        // List<Student> myList = Arrays.asList(
        //     new Student(1L, "A", 29),
        //     new Student(2L, "C", 21),
        //     new Student(3L, "B", 23)
        // );
        // System.out.println("Before sorting:");
        // for (Student e : myList) {
        //     System.out.println(e);
        // }
        // Collections.sort(myList);
        // System.out.println("After sorting:");
        // for (Student e : myList) {
        //     System.out.println(e);
        // }

        Student s1 = new Student(1L, "A", 29);
        Student s2 = new Student(2L, "C", 21);

        // System.out.println(s2.compareTo(s1));

        ByAge byAge = new ByAge();
        System.out.println(byAge.compare(s1, s2));
        
        ByName byName = new ByName();
        System.out.println(byName.compare(s1, s2));

        // Student[] myArr = new Student[] {
        //     new Student(1L, "A", 29),
        //     new Student(2L, "C", 21),
        //     new Student(3L, "B", 23),
        // };
        // System.out.println("Before sorting:");
        // for (Student e : myArr) {
        //     System.out.println(e);
        // }
        // // Arrays.sort(myArr, byAge);
        // Arrays.sort(myArr, byName);
        // System.out.println("After sorting:");
        // for (Student e : myArr) {
        //     System.out.println(e);
        // }

        List<Student> myList = Arrays.asList(
            new Student(1L, "A", 29),
            new Student(2L, "C", 21),
            new Student(3L, "B", 23)
        );
        System.out.println("Before sorting:");
        for (Student e : myList) {
            System.out.println(e);
        }
        // Collections.sort(myList, byAge);
        Collections.sort(myList, byName);
        System.out.println("After sorting:");
        for (Student e : myList) {
            System.out.println(e);
        }

    }

}
