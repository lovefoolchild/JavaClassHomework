package class12;

public class HW2 {
    public static void main(String[] args) {
        // Create a String and print it in reverse order (Sunday → yadnuS).

        String day="Sunday";
        String reverse="";
        for (int i=day.length()-1; i>=0; i--){
            reverse=reverse+day.charAt(i);
        }
        System.out.println(reverse);
    }
}
