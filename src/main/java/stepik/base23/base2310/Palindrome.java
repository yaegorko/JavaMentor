package stepik.base23.base2310;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        StringBuilder str = new StringBuilder(text.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        return str.toString().equals(str.reverse().toString()); // your implementation here
    }
}
