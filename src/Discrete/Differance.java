
package Discrete;

        import java.util.ArrayList;

public class Differance {
    public static void main(String[] args) {

        int [] a = new int[] {1 ,5 ,37, 2,6};
        int [] b = new int[] {14,23,4,5,3};

        ArrayList<Integer> diff = getDiff(a,b);
        for (int i = 0; i < diff.size(); i++) {
            System.out.print(diff.get(i) + " ");
        }


    }

    public static ArrayList<Integer> getDiff(int [] a, int [] b) {


        ArrayList<Integer> inter = Intersection.getInter(a,b);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : a
        ) {
            result.add(i);
        }

        for (int i = 0; i < inter.size(); i++) {
            if (result.contains(inter.get(i))){
                result.remove(inter.get(i));
            }
        }

        return result;

    }

}
