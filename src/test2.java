import java.util.Scanner;
import java.util.Stack;

public class test2 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean [] x = new boolean[28];
        int test;
        int n;
        String s;

        for (int i = 0; i < 1; i++) {

        }


    }

    public static char charactersGames(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char target = sc.next().charAt(0);
        String x = sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println(x.charAt(i-1));
        }


        return target;
    }





}
