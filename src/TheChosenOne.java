import java.util.Scanner;

public class TheChosenOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int box = scanner.nextInt();
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }


        int max = 0;
        int i = 0;
        int j = len-1;
        while (i < j-(box/2)){
            int sum1 = 0;
            int sum2 = 0;
            for (int k = 0; k < box; k++) {
                sum1 +=arr[j-k];
                sum2 +=arr[i+k];
            }
            if (sum1 > max){
                max = sum1;
            }
            if (sum2>max){
                max = sum2;
            }
            i++;
            j--;

        }
        System.out.println(max);

    }
}
