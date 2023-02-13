public class HackerRankinaString {

    public static void main(String[] args) {

        System.out.print(hackerrankInString("hereiamstackerrank"));

    }



    public static String hackerrankInString(String s) {
        // Write your code here
        String yes=  "YES";
        String no = "NO";
        String hackerrank = "hackerrank";
        int indexHack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hackerrank.charAt(indexHack)){
                indexHack++;
            }
        }



        if (indexHack == hackerrank.length()){
            return yes;
        }else
            return no;
    }

}
