package class16;

/* Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
public class HW1 {
    public static String reversedStr(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversedStr("hello"));
    }
}


