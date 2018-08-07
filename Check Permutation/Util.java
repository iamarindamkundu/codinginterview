/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */

 public class Util {
     public static void main(String args[]) {
        System.out.println(isPermutation("apple", "lpape"));
        System.out.println(isPermutation2("apple", "lpbpe"));
     }

     // approach #1: check if two string has identical number of characters
     public static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int charCount[] = new int[128];
        char charArray[] = s.toCharArray();
        for (char c  : charArray) {
            charCount[c] ++;
        }

        for (int i = 0 ; i < t.length(); i++) {
            int val = (int) t.charAt(i);
            charCount[val] --;
            if (charCount[val] < 0) {
                return false;
            }
        }
        return true;
     }

     // approach #2: Sort the string
     public static boolean isPermutation2(String s, String t) {
         if (s.length() != t.length()) 
            return false;
        return sort(s).equals(sort(t));
     }

     public static String sort(String s) {
         char[] charArray = s.toCharArray();
         java.util.Arrays.sort(charArray);
         return new String(charArray);
     }
 }