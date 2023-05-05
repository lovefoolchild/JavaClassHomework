package class16;

/* Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
 Method should be available inside the class only where it was declared and executed by calling it is name.
 */
public class HW2 {
    static String newStr(String s){
        return s.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        System.out.println(newStr("lovelymae"));
    }
}
