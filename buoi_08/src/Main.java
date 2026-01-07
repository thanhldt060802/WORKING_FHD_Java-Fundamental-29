import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // int x1 = 10;
        // int x2 = 10;

        // System.out.println(x1 == x2);
        // System.out.println(System.identityHashCode(x1));
        // System.out.println(System.identityHashCode(x2));

        // Integer x1 = new Integer(10);
        // Integer x2 = new Integer(10);

        // System.out.println(x1 == x2);
        // System.out.println(System.identityHashCode(x1));
        // System.out.println(System.identityHashCode(x2));

        // int[] x1 = new int[] {2, 4, 6, 8, 10};
        // int[] x2 = x1.clone();

        // x2[1] = 100;

        // System.out.println(Arrays.toString(x1));
        // System.out.println(Arrays.toString(x2));

        // int[] x1 = new int[] {2, 4, 6, 8, 10};
        
        // System.out.println(Arrays.toString(x1));
        // // test(x1);  // arr = x1
        // // binhPhuong1(x1);
        // int[] result = binhPhuong2(x1);
        // System.out.println(Arrays.toString(x1));
        // System.out.println(Arrays.toString(result));

        // String a = "Hello world!";
        // System.out.println(a.substring(1, 4));

        // int[] x1 = new int[] {2, 4, 6, 8, 10};
        // int[] x2 = Arrays.copyOfRange(x1, 1, 4);
        // System.out.println(Arrays.toString(x2));

        int[] input = new int[] {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = slidingWindow(input, target);
        System.out.println(result);

    }

    public static int simpleSlidingWindow(int[] arr, int target) {
        int windowSize = 1;
        while (windowSize <= arr.length) {
            for (int i = 0; i < arr.length - (windowSize - 1); i++) {
                int[] subArr = Arrays.copyOfRange(arr, i, i + windowSize);
                if (sum(subArr) >= target) {
                    return windowSize;
                }
            }
            windowSize++;
        }
        return 0;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int slidingWindow(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
