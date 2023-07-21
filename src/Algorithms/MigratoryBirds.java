package Algorithms;/*Given an array of bird sightings where every
element represents a bird type id, determine the
id of the most frequently sighted type.
If more than 1 type has been spotted that maximum amount,
return the smallest of their ids.*/


import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.print(migratoryBirds(arr));


    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int numbers [] = new int[arr.size()];
        int num;
        int count ;
        int maxCount = 0;
        int min = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            num = arr.get(i);
            count = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (num == arr.get(j)){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                min = num;
                numbers[i] =count;

            }

        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == maxCount){
                if (min > arr.get(j)){
                    min = arr.get(j);
                }
            }
        }



        return min;
    }



}
