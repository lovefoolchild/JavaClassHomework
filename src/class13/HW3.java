package class13;

public class HW3 {
    public static void main(String[] args) {
        /*  How would you swap  2 strings without a temporary variable? */

        String a="dog";
        String b="cat";

        System.out.println("Before swapping:");
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);

        a=a+b;
        b=a.substring(0,a.length() - b.length());
        a=a.substring(b.length());
        System.out.println("After swapping:");
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
    }
}
