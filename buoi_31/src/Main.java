public class Main {

    public static void main(String[] args) {

        // A objA = new A(100);
        // A.B objB = objA.new B(-100);

        // // System.out.println(objA.value);
        // // System.out.println(objB.value);
        // // objA.greeting();
        // // objB.greeting();

        // objB.testAccessToComponentsOfClassA();

        // A.B objB = new A.B(100);

        /**
         * class User {
         *      class Info {
         *          - String firstName
         *          - String lastName
         *          - String address
         *          - String phoneNumber
         *          - String email
         *      } 
         * 
         *      class Account {
         *          - String username
         *          - String password
         *          - int accumulatedPoints
         *      }
         * 
         *      - String id
         *      - User.Info info
         *      - User.Account account
         * }
         */

        // A objA = new A(100);
        // A.B objB = objA.new B(-100);

        // System.out.println(objA.value);
        // System.out.println(objB.value);
        // objA.greeting();
        // objB.greeting();

        // objB.testAccessToComponentsOfClassA();

        // A.B objB = new A.B(100);

        // System.out.println(objB.value);
        // objB.greeting();

        // A objA = new A();
        // objA.solveProblem();

        MyInterface m1 = new MyInterface() {

            @Override
            public void doSomething() {
                System.out.println("Hello Java 29");
            }
            
        };

        MyInterface m2 = new MyInterface() {

            @Override
            public void doSomething() {
                System.out.println("Goodnight Java 29");
            }
            
        };

        // test(m2);

        m1.doSomething();
        m2.doSomething();

    }

    public static void test(MyInterface myInterface) {
        myInterface.doSomething();
    }
    
}
