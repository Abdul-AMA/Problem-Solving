import java.util.*;

public class BetweenTwoSets {
    public static void main(String[] args) {


        List<Integer>a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer>b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);



        System.out.print(getTotalX(a,b));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
        int min = a.get(0);
        int max = b.get(0);

        for (Integer x :
                a) {
            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        for (Integer x :
                b) {

            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }


        }

        for (int i = min; i <= max; i++) {
            boolean x = true;
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) != 0) {
                    x = false;
                }
            }
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) % i != 0) {
                    x = false;
                }
            }
            if (x) {
                count++;
            }
        }

        return count;
    }
}
