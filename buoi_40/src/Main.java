import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // List<TripleNumber> list = new ArrayList<TripleNumber>();
        // list.add(new TripleNumber(4, 2, 5));
        // list.add(new TripleNumber(2, 3, 1));
        // list.add(new TripleNumber(4, 5, 1));
        // list.add(new TripleNumber(3, 6, 2));
        // list.add(new TripleNumber(1, 5, 3));
        // list.add(new TripleNumber(4, 3, 1));
        // list.add(new TripleNumber(3, 2, 3));
        // list.add(new TripleNumber(1, 5, 6));
        // list.add(new TripleNumber(3, 5, 4));
        // list.add(new TripleNumber(2, 2, 3));

        // list.stream().forEach((tn) -> {
        // System.out.println(tn);
        // });

        // list.stream()
        // .filter((tn) -> tn.n1 % 2 == 0)
        // .forEach((tn) -> System.out.println(tn));

        // Object[] result = list.stream()
        // .filter((tn) -> tn.n1 % 2 == 0)
        // .toArray();
        // for (Object obj : result) {
        // System.out.println(((TripleNumber)obj).n1);
        // }

        // List<TripleNumber> result = list.stream()
        // .filter((tn) -> tn.n1 % 2 == 0)
        // .toList();
        // for(TripleNumber tn : result) {
        // System.out.println(tn.n1);
        // }

        // List<TripleNumber> result = list.stream()
        // .filter((tn) -> tn.n1 % 2 == 0)
        // .collect(Collectors.toList());
        // for (TripleNumber tn : result) {
        // System.out.println(tn);
        // }

        // List<String> list = Arrays.asList(
        // "abc", "xyz", "def", "123", "abc", "123"
        // );

        // Set<String> result = list.stream()
        // .collect(Collectors.toSet());
        // System.out.println(result);

        // List<Integer> list = Arrays.asList(
        // 1, 2, 1, 3, 2, 3, 4, 4, 3, 5, 6, 5, 7, 8, 4, 7, 8, 9
        // );

        // Set<Integer> result = list.stream()
        // .filter((n) -> n % 2 == 0)
        // .collect(Collectors.toSet());
        // System.out.println(result);

        // List<Integer> result = list.stream()
        // .filter((n) -> n % 2 == 0)
        // .collect(Collectors.toList());
        // System.out.println(result);

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // System.out.println("Input:");
        // list.forEach((n) -> System.out.println(n));

        // Map<Integer, Integer> result = list.stream()
        // .collect(Collectors.toMap(
        // (n) -> n,
        // (n) -> n * n));
        // // System.out.println(result);
        // System.out.println("Output:");
        // result.forEach((k, v) -> System.out.printf("key=%s, value=%s\n", k, v));

        // Map<String, Double> result = list.stream()
        // .filter(
        // (n) -> n % 2 == 0)
        // .collect(Collectors.toMap(
        // (n) -> n + "",
        // (n) -> Math.sqrt(n)));
        // System.out.println("Output:");
        // result.forEach((k, v) -> System.out.printf("key=%s, value=%s\n", k, v));

        // List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9);
        // System.out.println("Input:");
        // list.forEach((n) -> System.out.println(n));

        // Map<Integer, Integer> result = list.stream()
        //         .collect(Collectors.toMap(
        //                 (n) -> n,
        //                 (n) -> n * n,
        //                 (n1, n2) -> n1));
        // System.out.println("Output:");
        // result.forEach((k, v) -> System.out.printf("key=%s, value=%s\n", k, v));

        // List<TripleNumber> list = new ArrayList<TripleNumber>();
		// list.add(new TripleNumber(1, 2, 5));
		// list.add(new TripleNumber(2, 3, 1));
		// list.add(new TripleNumber(3, 5, 1));
		// list.add(new TripleNumber(4, 6, 2));
		// list.add(new TripleNumber(5, 5, 3));
		// list.add(new TripleNumber(6, 3, 1));
		// list.add(new TripleNumber(7, 2, 3));
		// list.add(new TripleNumber(8, 5, 6));
		// list.add(new TripleNumber(9, 5, 4));
		// list.add(new TripleNumber(10, 2, 3));
        // list.add(new TripleNumber(3, -1, -4));

        // Map<TripleNumber, Integer> result = list.stream()
        // .collect(Collectors.toMap(
        //     (tn) -> tn,
        //     (tn) -> tn.n1 + tn.n2 + tn.n3,
        //     (tn1, tn2) -> tn1));
        // result.forEach((k, v) -> System.out.printf("key=%s, value=%s\n", k, v));

        // List<Integer> list = Arrays.asList(5, 4, 2, 6, 4, 2, 4, 3, 1, 2, 4, 5);
        // System.out.println("Input:");
        // list.forEach((n) -> System.out.println(n));

        // Map<Integer, Integer> result = list.stream()
        //         .collect(Collectors.toMap(
        //                 (n) -> n,
        //                 (n) -> n * n,
        //                 (n1, n2) -> n1,
        //                 () -> new LinkedHashMap<>()));
        // System.out.println("Output:");
        // result.forEach((k, v) -> System.out.printf("key=%s, value=%s\n", k, v));

        List<TripleNumber> list = new ArrayList<TripleNumber>();
		list.add(new TripleNumber(4, 2, 5));
		list.add(new TripleNumber(2, 3, 1));
		list.add(new TripleNumber(4, 5, 1));
		list.add(new TripleNumber(3, 6, 2));
		list.add(new TripleNumber(1, 5, 3));
		list.add(new TripleNumber(4, 3, 1));
		list.add(new TripleNumber(3, 2, 3));
		list.add(new TripleNumber(1, 5, 6));
		list.add(new TripleNumber(3, 5, 4));
		list.add(new TripleNumber(2, 2, 3));

        Map<Integer, List<TripleNumber>> result = list.stream()
        .collect(Collectors.groupingBy((tn) -> tn.n1));
        result.forEach((k, v) -> {
            System.out.println("Key: " + k);
            v.forEach((e) -> System.out.println(e));
        });

    }

}
