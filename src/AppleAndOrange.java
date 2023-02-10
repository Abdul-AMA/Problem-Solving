import java.util.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);

        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);


        countApplesAndOranges(7, 11 ,5 ,15,apples,oranges);

    }

        public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
            // Write your code here
            int appleCount = 0;
            int orangeCount = 0;

            int house = t-s;

            int minAppleHouse = s - a;
            int maxAppleHouse = minAppleHouse + house;

            int minHouseOrange= t - b;
            int maxHouseOrange= minHouseOrange - house;

            for (int i = 0; i < apples.size(); i++) {
                if (apples.get(i) > 0) {
                    if (apples.get(i) >= minAppleHouse && apples.get(i) <= maxAppleHouse) {
                        appleCount++;
                    }
                }
            }
            for (int i = 0; i < oranges.size(); i++) {
                if (oranges.get(i) <0){
                    if (oranges.get(i) <= minHouseOrange && oranges.get(i) >= maxHouseOrange){
                        orangeCount++;
                    }
                }
            }

            System.out.println(appleCount);
            System.out.println(orangeCount);


        }
}
