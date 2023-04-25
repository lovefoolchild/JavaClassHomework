package class13;

public class HW1 {
    public static void main(String[] args) {
        /* How would you reverse a String word by word? For example:
        input=>This is a sentence I want to reverse
        output=>sihT si a ecnetnes i tnaw ot esrever */

        String sentence="This is a sentence I want to reverse";
        StringBuilder sentence2=new StringBuilder(sentence);
        sentence2.reverse();
        sentence=sentence2.toString();
        System.out.println(sentence);

    }
}
