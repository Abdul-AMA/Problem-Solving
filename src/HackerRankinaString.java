public class HackerRankinaString {

    public static void main(String[] args) {

        System.out.println(hackerrankInString("knarrekcah"));
        System.out.println(hackerrankInString("hackerrank"));
        System.out.println(hackerrankInString("hackeronek"));
        System.out.println(hackerrankInString("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(hackerrankInString("rhackerank"));
        System.out.println(hackerrankInString("ahankercka"));
        System.out.println(hackerrankInString("hacakaeararanaka"));
        System.out.println(hackerrankInString("hhhhaaaaackkkkerrrrrrrrank"));
        System.out.println(hackerrankInString("crackerhackerknar"));
        System.out.println(hackerrankInString("hhhackkerbanker"));


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
                if (indexHack == hackerrank.length()){
                    break;
                }
            }
        }

        if (indexHack == hackerrank.length()){
            return yes;
        }else
            return no;
    }

}
