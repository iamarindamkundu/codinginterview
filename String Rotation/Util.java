/**
String Rotation: Assume you have a method isSubst ring which checks if one word is a substring
of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat"). 
 */
public class Util {
    public static void main(String args[]) {
        System.out.println(checkStringRotation("waterbottle", "erbottlewat"));
    }

    // Only consider right rotation and considering both string are equal length
    public static boolean checkStringRotation (String s1, String s2) {
        if (isBothStringEqual(s1, s2)) {
            return false;
        }
        else {
            for (int i = 1 ; i < s1.length(); i++) {
                String result = s1.substring(i);
                result += s1.substring(0,i);
                System.out.println(result);
                s1 = result;
                if (isBothStringEqual(s1, s2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isBothStringEqual(String s1, String s2) {
        for (int i = 0 ; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}