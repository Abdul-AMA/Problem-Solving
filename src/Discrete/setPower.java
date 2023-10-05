package Discrete;

import java.util.ArrayList;
import java.util.Arrays;

public class setPower {
    public static void main(String[] args) {
        int [] set = new int [] {1,2,3};

        int len = (int)Math.pow(2,set.length);
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int []{});
        int subSize = 1;
        int x = 1;
        int [] temp;
        for (int i = 0; i < len-2; i++) {
            if (i / set.length == x){
                subSize++;
                x++;
            }
            temp = new int [subSize];
            for (int j = 0; j < subSize; j++) {

            }
            result.add(temp);
        }
        result.add(set);

        System.out.print("{");
        for (int i = 0; i < result.size(); i++) {
            int[] array = result.get(i);
            System.out.print(Arrays.toString(array));

            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");


    }
}
