public class X {

    public static void main(String[] args) throws MyException {
        
        System.out.println(isOddNumber(0));

    }
    
    public static boolean isOddNumber(int n) throws MyException {
        if (n < 0) {
            throw new MyException("n must greater than 0");
        }

        return n % 2 == 0;
    }

}