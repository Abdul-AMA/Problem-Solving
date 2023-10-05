package Discrete;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {

        int [] a = new int[] {1 ,5 ,37, 2,6};
        int [] b = new int[] {14,23,4,5,3};

        ArrayList<Integer> union = getUnion(a,b);
        for (int i = 0; i < union.size(); i++) {
            System.out.print(union.get(i) + " ");
        }


    }

    public static ArrayList<Integer> getUnion(int [] a, int [] b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : a) {
            result.add(i);
        }
        for (int i = 0; i < b.length; i++) {
            if (!result.contains(b[i])){
                result.add(b[i]);
            }
        }

        return result;

    }


}