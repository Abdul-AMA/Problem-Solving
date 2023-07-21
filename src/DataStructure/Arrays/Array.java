package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        ArrayList<Integer> x =  new ArrayList<Integer>();
        for (int i = a.size()-1; i >=0; i--) {
            x.add(a.get(i));
        }
        return x;

    }

}
