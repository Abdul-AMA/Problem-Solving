package DataStructure.bigo;

public class fac {
    public static void main(String[] args) {
        System.out.println(factorial1(4));
        System.out.println(factorialN(4));
    }

    public static int factorialN(int n) {
        if ( n == 0){
            return 1;
        }else
            return n*factorialN(n-1);
    }

    public static int factorial1(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
