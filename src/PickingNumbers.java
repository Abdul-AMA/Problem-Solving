import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);
        System.out.print(pickingNumbers(a));

    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int max = 0;
        int x;
        int y;
        int count = 0;


        for (int i = 0; i < a.size(); i++) {
            x = a.get(i);
            for (int j = 0; j < a.size(); j++) {
                y =  a.get(j);
                if (x == y || x == y+1) {
                    count++;
                }

            }
            if (count > max) {
                max = count;
            }
            count = 0;


        }

        return max;

    }

}
