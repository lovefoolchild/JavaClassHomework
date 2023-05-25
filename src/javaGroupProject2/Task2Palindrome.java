package javaGroupProject2;

/*
    Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the
    same forwards and backward. For example, "madam" is a palindrome.
 */
public class Task2Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        String word2 = "";

        StringBuilder wordPalindrome = new StringBuilder(word);
        wordPalindrome.reverse();
        word2=wordPalindrome.toString();

        if (word.equals(word2)) {
            System.out.println("Given string is a palindrome.");
        } else {
            System.out.println("Given string is not a palindrome.");
        }
    }
}
