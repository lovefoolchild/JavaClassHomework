package class13;

public class HW2 {
    public static void main(String[] args) {
        /* How would you check if String is palindrome or not? aba=> true
        Abbc =>false */

        String word="abbca";
        String word2="";
        StringBuilder reverseWord=new StringBuilder(word);
        reverseWord.reverse();
        word2=reverseWord.toString();

        for (int i=word.length()-1; i>=0; i++){
        } if (word.equals(word2)){
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is not palindrome");
        }
    }
}
