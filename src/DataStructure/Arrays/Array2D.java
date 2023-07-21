package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(-9, -9, -9, 1, 1, 1)));
        arr.add(new ArrayList<>(Arrays.asList(0, -9, 0, 4, 3, 2)));
        arr.add(new ArrayList<>(Arrays.asList(-9, -9, -9, 1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(0, 0, 8, 6, 6, 0)));
        arr.add(new ArrayList<>(Arrays.asList(0, 0, 0, -2, 0, 0)));
        arr.add(new ArrayList<>(Arrays.asList(0, 0, 1, 2, 4, 0)));

        hourglassSumprint(arr);
    }



    public static void hourglassSumprint(ArrayList<ArrayList<Integer>> arr) {
        // Write your code here
        int maxResult = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += arr.get(i + k).get(j + 1);
                    System.out.print(arr.get(i + k).get(j + 1));
                    if (k != 1) {
                        sum += arr.get(i + k).get(j);
                        sum += arr.get(i + k).get(j + 2);
                        System.out.print(arr.get(i + k).get(j ));
                        System.out.print(arr.get(i + k).get(j + 2));

                    }
                    System.out.println();
                }
                System.out.println(" sum: " + sum);
                if (sum > maxResult) {
                    maxResult = sum;
                    System.out.println("max sum: " + maxResult);
                }
            }

        }


    }
}
