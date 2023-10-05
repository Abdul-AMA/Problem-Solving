package DataStructure.Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anaagrm", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            s1[s.charAt(i) - 97] += 1;
            t1[t.charAt(i) - 97] += 1;
        }
        return Arrays.equals(s1, t1);
    }
}
