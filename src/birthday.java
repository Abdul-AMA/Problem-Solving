import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            int min = in.nextInt();
            int max = in.nextInt();
            //  4   7

            int slices = max;

            // now we need to devide 7 - (4 * 7%4) = 3 into the min
            // so we need to devide 3 into 4;
            int remainForMinSlices = slices - min*(max/min);
            slices -= remainForMinSlices;
            System.out.println(remainForMinSlices);
            System.out.println(slices);
            //now we need to find way to devide 3 into 4
            int temp = 0;

            /*
            120 85
            

            */

        }
    }
}
