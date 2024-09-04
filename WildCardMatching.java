import java.util.Arrays;

public class WildCardMatching {

    public boolean matchUtility(int i, int j, String s, String p, int[][] memo) {
        // i and j fully finished
        if (i < 0 && j < 0) return true;
        // i have some characters but j finished
        if (i >= 0 && j < 0) return false;
        // i finished but j have some char
        if (i < 0 && j >= 0) {
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') return false;
            }
            return true;
        }
        if (memo[i][j] != -1) {
            return memo[i][j] == 1;
        }
        // Either i and j matches or j have "?"
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            boolean flag = matchUtility(i - 1, j - 1, s, p, memo);
            memo[i][j] = flag ? 1 : 0;
            return flag;
        }
        // j has '*' and either move i but not j or move j but not i
        if (p.charAt(j) == '*') {
            boolean flag = matchUtility(i - 1, j, s, p, memo) || matchUtility(i, j - 1, s, p, memo);
            memo[i][j] = flag ? 1 : 0;
            return flag;
        }
        // Not Found
        memo[i][j] = 0;
        return false;
    }

    public boolean isMatch(String s, String p) {
        int[][] memo = new int[s.length()][p.length()];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return matchUtility(s.length() - 1, p.length() - 1, s, p, memo);
    }

    public static void main(String[] args) {
        WildCardMatching matcher = new WildCardMatching();

        String s1 = "aa";
        String p1 = "a*";
        System.out.println("Test case 1: " + matcher.isMatch(s1, p1)); // Output: true

        String s2 = "cb";
        String p2 = "?a";
        System.out.println("Test case 2: " + matcher.isMatch(s2, p2)); // Output: false

        String s3 = "adceb";
        String p3 = "*a*b";
        System.out.println("Test case 3: " + matcher.isMatch(s3, p3)); // Output: true

        String s4 = "acdcb";
        String p4 = "a*c?b";
        System.out.println("Test case 4: " + matcher.isMatch(s4, p4)); // Output: false

        String s5 = "";
        String p5 = "*";
        System.out.println("Test case 5: " + matcher.isMatch(s5, p5)); // Output: true
    }
}
