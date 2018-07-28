/**
URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith "J 13
Output: "Mr%20John%20Smith" 
*/
public class Util{

    public static void main(String[] args) {
        System.out.println(createUrl("Mr John Smith    "));
    }

    public static String createUrl(String str) {
        char[] charArray = str.toCharArray();
        char[] delimiter = new char[]{'%','2','0'};
        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {

            }
        }
        return null;
    }
}