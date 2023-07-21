package Algorithms;

import java.util.*;

public class MiniMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        miniMaxSum(arr);



    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long sum [] = new long [5];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(j==i){
                    continue;
                }
                sum[i] += arr.get(j);
            }
        }

        long max = sum[0];
        long min = sum[0];

        for (int i = 0; i < sum.length; i++) {
            if(sum[i] > max){
                max = sum[i];
            }
            if(sum[i] < min){
                min = sum[i];
            }
        }

        System.out.print(min + " " + max);



    }


}
