import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);


        int max = 0;
        int count = 0;

        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) > max){
                max = candles.get(i);
            }
        }
        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) == max){
                count++;
            }
        }

        System.out.print(count);

    }
}
