public class BuildAString {
    public static void main(String[] args) {


        int result = buildString(2   , 4, "acabccadeljadel");
        System.out.print(result);


    }

    public static int buildString(int a, int b, String s) {
        // Write your code here
        int cost = 0;
        cost += 2 * a;
        int x;
        for (int i = 2; i < s.length(); i++) {
            if (i < (s.length() + 1) / 2) {
                x = i * 2;
            } else {
                x = s.length();
            }
            for (int j = x; j > i + 1; j--) {
                if (s.substring(0, i).contains(s.substring(i, j))) {
                    i = j;
                    cost += b;
                    break;
                } else
                    cost += a;
            }
        }
        return cost;
    }
}
