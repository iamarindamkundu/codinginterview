// Check if all characters are unique in a string 
public class Util {

    public static void main (String[] args) {
        System.out.println(isUniqueCharacters("ah"));
    }

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
}