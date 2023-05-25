package javaGroupProject2;

/*
    Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
    the output should be "olleH".
*/
public class Task1ReverseString {
    public static void main(String[] args) {
        String word="Hello";

        StringBuilder reverseStr = new StringBuilder(word);
        System.out.println(reverseStr.reverse().toString());
    }
}
