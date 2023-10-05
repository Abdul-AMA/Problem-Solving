package Discrete;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {

        int [] a = new int[] {1 ,5 ,37, 2,6};
        int [] b = new int[] {14,23,4,5,3};

        ArrayList<Integer> inter = getInter(a,b);
        for (int i = 0; i < inter.size(); i++) {
            System.out.print(inter.get(i) + " ");
        }


    }

    public static ArrayList<Integer> getInter(int [] a, int [] b) {

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : a
        ) {
            temp.add(i);
        }

        for (int i = 0; i < b.length; i++) {
            if (temp.contains(b[i])){
                result.add(b[i]);
            }
        }

        return result;

    }

}
