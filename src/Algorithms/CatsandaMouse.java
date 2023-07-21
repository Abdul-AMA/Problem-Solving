package Algorithms;

public class CatsandaMouse {
    public static void main(String[] args) {

        System.out.print(catAndMouse(1,2,3));


    }

    static String catAndMouse(int x, int y, int z) {

        if(Math.abs(x-z) < Math.abs(y-z)){
            return "Cat A";
        } else if (Math.abs(x-z) > Math.abs(y-z)) {
            return "Cat B";
        }else
            return "Mouse C";
    }

}
