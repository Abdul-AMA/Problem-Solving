package Algorithms;

public class TimeConversion {
    public static void main(String[] args) {

        String s = "09:40:22AM";
        System.out.println(timeConversion(s));;


    }

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0,2));
        String newTime = "";
        if(s.contains("PM") && hour !=12){
            hour+=12;
        }
        if(s.contains("AM") && hour == 12){
            hour = 0;
        }

        newTime = String.format("%02d%s",hour,s.substring(2,s.length()-2));

        return newTime;
    }
}
