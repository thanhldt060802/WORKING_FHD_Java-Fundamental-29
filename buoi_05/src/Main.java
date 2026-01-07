import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String a = "Le Dao Tan Thanh";
        // char result = a.charAt(5);
        // System.out.println(result);
        // System.out.println(a.charAt(5));

        // String str = "ABCDEF";
		// System.out.println(str.compareTo("ABCDEFGH")); // str - anotherString
		// System.out.println(str.compareTo("ABC"));
		// System.out.println(str.compareTo("ABIDEF"));
		// System.out.println(str.compareTo("ABCDEF"));
		// System.out.println(str.compareTo("abcdef"));

        /*
         * ABCDEF
         * abcdef
         */

        // String str = "ABCDEF";
		// System.out.println(str.compareToIgnoreCase("ABCDEFGH")); // str - anotherString
		// System.out.println(str.compareToIgnoreCase("ABC"));
		// System.out.println(str.compareToIgnoreCase("ABIDEF"));
		// System.out.println(str.compareToIgnoreCase("ABCDEF"));
		// System.out.println(str.compareToIgnoreCase("abcdef"));

        // String str = "ABCDEF";
		// System.out.println(str.concat("XYZ"));
        // System.out.println(str + "XYZ");

        // String str = "ABCDEF";
		// System.out.println(str.contains("DEF"));
		// System.out.println(str.contains("XYZ"));

        // String str = "ABCDEF";
		// // System.out.println(str.startsWith("ABC"));
		// // System.out.println(str.startsWith("DEF"));
        // // System.out.println(str.endsWith("ABC"));
		// // System.out.println(str.endsWith("DEF"));
        // System.out.println(str.startsWith("BCDE"));
        // System.out.println(str.endsWith("BCDE"));

        // String str = "ABCDEF";
		// System.out.println(str.equals("ABC"));
		// System.out.println(str.equals("ABCDEF"));
		// System.out.println(str.equals("abcdef"));
        // System.out.println(str.equals(100));

        // String str = "ABCDEF";
		// System.out.println(str.equalsIgnoreCase("ABC"));
		// System.out.println(str.equalsIgnoreCase("ABCDEF"));
		// System.out.println(str.equalsIgnoreCase("abcdef"));

        // String str = "ABCDEF";
		// System.out.println(str.indexOf("ABC"));
		// System.out.println(str.indexOf("DEF"));
		// System.out.println(str.indexOf("XYZ"));

        // String str = "ABCDEF";
		// System.out.println(str.length());

        // String str1 = "ABCDEF";
		// String str2 = "";
		// String str3 = "  ";
		// // System.out.println(str1.isBlank());
		// // System.out.println(str2.isBlank());
		// // System.out.println(str3.isBlank());
        // System.out.println(str1.isEmpty());
		// System.out.println(str2.isEmpty());
		// System.out.println(str3.isEmpty());

        // String str = "ABABAB";
		// System.out.println(str.replace("A", "XX"));
		// System.out.println(str.replace("A", ""));
        // System.out.println(str.replace("ABA", "XXX"));

        // String str = "   ABCDEF   ";
        // System.out.println(str);
		// System.out.println(str.trim());

        // String str = "ABCDEF";
		// System.out.println(str.substring(1, 4));

        // String str = "AbCdEf";
		// System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // System.out.println(str);

        // String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
		// System.out.println(str.formatted("Tan Thanh", 29, 1.78));
        // System.out.println(str.formatted("Dinh Tung", 21, 1.98));

        // String str = "My name is %s, I'm %d years old, I'm %.2f meters tall.";
        // System.out.printf(str, "Tan Thanh", 29, 1.78);

        // String result = String.format("My name is %s, I'm %d years old, I'm %.2f meters tall.", "Tan Thanh", 29, 1.78);
        // System.out.println(result);
        // System.out.println(String.format("My name is %s, I'm %d years old, I'm %.2f meters tall.", "Tan Thanh", 29, 1.78));

        // String a = null;
        // System.out.println(a.charAt(1));

        // int[] arr1 = new int[5];
        // System.out.println(Arrays.toString(arr1));

        // Integer[] arr2 = new Integer[5];
        // System.out.println(Arrays.toString(arr2));

        // boolean[] arr3 = new boolean[5];
        // System.out.println(Arrays.toString(arr3));

        // Boolean[] arr4 = new Boolean[5];
        // System.out.println(Arrays.toString(arr4));

        // String[] arr5 = new String[5];
        // System.out.println(Arrays.toString(arr5));

        // int[] arr = new int[5];
        // System.out.println(Arrays.toString(arr));
        // arr[2] = 100;
        // System.out.println(Arrays.toString(arr));

        // int[] arr = new int[] {10, 20, 30, 40, 50};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[3]);

        // int[] arr1 = new int[5];
        // int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(arr1.length);
        // System.out.println(arr2.length);

        // String str = "Le Dao Tan Thanh";
        // char[] tmp = str.toCharArray();
        // System.out.println(Arrays.toString(tmp));
        // byte[] tmp = str.getBytes();
        // System.out.println(Arrays.toString(tmp));

        // String str = "AA++BB++CC++DD++EE++FF";
        // String[] tmp = str.split("\\++");
        // System.out.println(Arrays.toString(tmp));

        // int[][] arr = new int[3][];
        // arr[0] = new int[3];
        // arr[1] = new int[5];
        // arr[2] = new int[8];
        // System.out.println(Arrays.deepToString(arr));

        // int[][] arr = new int[3][5];
        // arr[2][3] = 100;
        // System.out.println(Arrays.deepToString(arr));

        // int[][] arr = new int[][] {
        //     {10, 20, 30},
        //     {40, 50, 60, 70},
        //     {80, 90}
        // };
        // System.out.println(Arrays.deepToString(arr));
        // // System.out.println(arr[1][2]);
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);
        // System.out.println(arr[1].length);
        // System.out.println(arr[2].length);

        int[] arr1 = new int[] {10, 20, 30};
        int[] arr2 = arr1;
        // int[] arr2 = arr1.clone();

        arr1[1] = 100;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

}
