// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
// cannot use additional data structures? 
// Check if all characters are unique in a string 
public class Util {

    public static void main (String[] args) {
        System.out.println(isUniqueCharacters("ah"));
        System.out.println(isUniqueChar1("haha"));
        System.out.println(isUniqueChar2("haha"));
    }

    // approach #1 time complexity O(n^2)
    public static boolean isUniqueCharacters (String str) {
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (i != j && eachChar == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // approach #2 time complexity O(n)
    /**
     * String only uses lower case letter a to z
     */
    public static boolean isUniqueChar1 (String str) {
        int checker = 0;
        for (int i = 0 ; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    // approach #3 time complexity O(n)
    /**
     * Only applicable for ASCII characters
     */
    public static boolean isUniqueChar2 (String str) {
        boolean[] checker = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (checker[val]) {
                return false;
            }
            checker[val] = true;
        }
        return true;
    }
}