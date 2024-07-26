public class palindrome {
    public static String reverseString(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String str){
        String reversed = reverseString(str);
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        String inputString = "racecar";

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
