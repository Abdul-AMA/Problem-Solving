package Algorithms;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.print(kangaroo(2, 1, 1, 2));

    }


    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String yes = "YES";
        String no = "NO";

        if ((x1>x2 && v1>=v2) || (x1<x2 && v1<=v2)){
            return no;

        }
        if (Math.abs(x1-x2)%Math.abs(v1-v2) == 0){
            return yes;
        } else {
            return no;
        }
    }


}
