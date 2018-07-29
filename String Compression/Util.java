/**
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). 
 */

 public class Util {

    public static void main(String args[]) {
        System.out.println("First Comparison:"+compressedString("aabcccccaaa"));
        System.out.println("Second Comparion:"+compressedString("abcd"));
    }

    public static String compressedString(String str) {
        String result = "";
        for (int i = 0; i < str.length();) {
            int count = 0;
            char pointerChar = str.charAt(i);
            int pointerCharIndex = i;
            for (int j = pointerCharIndex; j < str.length(); j++) {
                if (pointerChar == str.charAt(j)) {
                    count ++;
                    i++;
                }
                else {
                    break;
                }
            }
            //System.out.println(pointerChar +":"+count);
            result += pointerChar + Integer.toString(count);
            //i++;
        }
        if (isCompressionHappend(result)) {
            return result;
        }
        else {
            return str;
        }
    }

    public static boolean isCompressionHappend(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && Character.getNumericValue(str.charAt(i)) > 1) {
                //System.out.println(str.charAt(i));
                return true;
            }
        }
        return false;
    }
 }