import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {

        List <Integer> a = new ArrayList<>();
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
        boolean is = true;
        int count = 0;

        List <Integer>temp = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j <a.size(); j++) {



            }
        }






        return max;

    }

}
//    int pickingNumbers(int a_count, int* a)
//    {
//        int i , j, max=0, counter = 0;
//
//        for(i = 0 ; i <= a_count-1 ; i++)
//        {
//            for(j = 0 ; j <= a_count -1 ; j++)
//            {
//                if(a[j] == a[i] || a[j] == a[i] +1)  {counter++;}
//            }
//
//            if(max < counter){max = counter;}
//            counter = 0;
//        }
//
//        return max;
//    }