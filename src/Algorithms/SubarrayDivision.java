package Algorithms;

import java.util.*;

public class SubarrayDivision {
    public static void main(String[] args) {

        List <Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);



        System.out.print(birthday(s,4,2));

    }


    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        int sum;
        for (int i = 0; i <= s.size()-m; i++) {
             sum = 0;
            for (int j = 0; j < m; j++) {
                sum+= s.get(i+j);
            }
            if (sum == d){
                count++;
            }
        }

        return count;
    }

}
