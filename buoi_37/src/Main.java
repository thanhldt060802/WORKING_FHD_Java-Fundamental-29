import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> p = (n) -> {
        //     return n % 2 != 0;
        // };
        
        // Consumer<Integer> c = (n) -> {
        //     System.out.println(n);
        // };

        // list.stream().filter(p).forEach(c);

        // List<Integer> result = list.stream().filter(p).collect(Collectors.toList());
        // for (Integer n : result) {
        //     System.out.println(n);
        // }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            double rand = Math.random() * 100;
            list.add((int)rand);
        }
        // List<Integer> result = list.parallelStream().sorted().collect(Collectors.toList());
        // System.out.println(result);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // long start = System.currentTimeMillis();
        // List<Integer> result1 = list.stream()
        // .filter((n) -> {
        //     return n % 2 != 0;
        // })
        // .sorted()
        // .collect(Collectors.toList());
        // long end = System.currentTimeMillis();

        // System.out.println("Time result1: " + (end - start));

        long start = System.currentTimeMillis();
        List<Integer> result2 = list.parallelStream()
        .filter((n) -> {
            return n % 2 != 0;
        })
        .sorted()
        .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println("Time result2: " + (end - start));

        // for (int i = 400000; i < 400050; i++) {
        //     System.out.print(result1.get(i) + ", ");
        // }
        // System.out.println();
        // for (int i = 400000; i < 400050; i++) {
        //     System.out.print(result2.get(i) + ", ");
        // }

    }

}
