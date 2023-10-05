import java.util.*;
import java.io.*;


public class Test {
    public static void main(String[] args) {

        Random x= new Random();

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11;j++) {
                System.out.print( x.nextInt(0,9) +  " ");
            }
            System.out.println();
        }


    }
}