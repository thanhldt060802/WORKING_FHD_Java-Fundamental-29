public class Main {

    public static void main(String[] args) /* throws Exception */ {

        // System.out.println(factorial(-10));
        // System.out.println(factorial(0));
        // System.out.println(factorial(1));
        // System.out.println(factorial(10));

        // System.out.println(factorialRecursion(-10));
        // System.out.println(factorialRecursion(0));
        // System.out.println(factorialRecursion(1));
        // System.out.println(factorialRecursion(10));

        // test(3);
        // System.out.println("main() done!");

        // for(int n = -1; n <= 10; n++) {
        //     System.out.println(String.format("Fibonacci(%d) = %d", n, fibo(n)));
        // }
        // System.out.println(fibo(10));

        // for(int n = -1; n <= 10; n++) {
        //     System.out.println(String.format("Fibonacci(%d) = %d", n, fiboRecursion(n)));
        // }
        // System.out.println(fiboRecursion(6));
        System.out.println(factorialRecursion(10));

    }

    public static int factorial(int n) /* throws Exception */ {
        if (n < 0) {
            return -1;
            // throw new Exception("invalid n parameter");
        } else if (n == 0) {
            return 1;
        } else {
            int tichGop = 1;
            for (int i = 2; i <= n; i++) {
                tichGop *= i;
            }
            return tichGop;
        }
    }

    public static int factorialRecursion(int n) {
        if (n < 0) {
            return -1;
        } else if (n >= 0 && n <= 1) {
            System.out.println(String.format("factorialRecursion(%d) done!", n));
            return 1;
        } else {
            int result = n * factorialRecursion(n - 1);
            System.out.println(String.format("factorialRecursion(%d) done!", n));
            return result;
        }
    }

    public static void test(int n) {
        if (n >= 0) {
            test(n - 1);
        }
        System.out.println(String.format("test(%d) done!", n));
    }

    public static int fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n >= 0 && n <= 1) {
            return n;
        } else {
            int n_2 = 0; // f(n - 2)
            int n_1 = 1; // f(n - 1)
            while(n >= 2) {
                int next = n_2 + n_1;
                n_2 = n_1;
                n_1 = next;
                n--;
            }
            return n_1;
        }
    }

    public static int fiboRecursion(int n) {
        if (n < 0) {
            return -1;
        } else if (n >= 0 && n <= 1) {
            System.out.println(String.format("fiboRecursion(%d) done!", n));
            return n;
        } else {
            int next = fiboRecursion(n - 1) + fiboRecursion(n - 2);
            System.out.println(String.format("fiboRecursion(%d) done!", n));
            return next;
        }
    }

}

/*
test(2) {
    if (n >= 0) {
        test(1) {
            if (n >= 0) {
                test(0) {
                    if (n >= 0) {
                        test(-1) {
                            if (n >= 0) {
                                test(n - 1);
                            }
                            System.out.println(String.format("test(%d) done!", n));
                        }
                    }
                    System.out.println(String.format("test(%d) done!", n));
                }
            }
            System.out.println(String.format("test(%d) done!", n));
        }
    }
    System.out.println(String.format("test(%d) done!", n));
}
*/