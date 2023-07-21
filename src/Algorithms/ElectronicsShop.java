package Algorithms;

import static java.lang.System.in;

public class ElectronicsShop {

    public static void main(String[] args) {

        int [] keyboards = new int[]{3,1};
        int [] drives = new int[]{5,2,8};

        System.out.print(getMoneySpent(keyboards,drives,10));


    }


    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int max = -1;
        int temp = 0;
        int total = 0;
        for (int i = 0; i < keyboards.length; i++) {
            temp = keyboards[i];
            for (int j = 0; j < drives.length; j++) {
                total = temp + drives[j];
                if (total <= b && total > max) {
                    max = total;
                }
            }
        }


        return max;
    }
}
