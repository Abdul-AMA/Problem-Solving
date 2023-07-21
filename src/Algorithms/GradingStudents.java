package Algorithms;

import java.util.*;

public class GradingStudents {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);


        for (Integer g : grades) {
            System.out.print(g + " ");
        }

        System.out.println();

        List<Integer> result = gradingStudents(grades);

        for (Integer r: result) {
            System.out.print(r + " ");
        }

    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        int temp = 0;
        double tempD = 0;
        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) < 38) {
                result.add(i, grades.get(i));
            }else {
                temp = grades.get(i) + 1;
                while (temp % 5 != 0) {
                    temp++;
                }
                if (temp - grades.get(i) < 3) {
                    tempD = grades.get(i) / 10.0;
                    tempD = Math.round(temp);
                    result.add(i, (int) tempD);
                } else {
                    result.add(i, grades.get(i));
                }
            }
        }


        return result;
    }
}
