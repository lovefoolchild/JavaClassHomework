package class7Loops;

public class HW2 {
    public static void main(String[] args) {
        // Print even numbers from 20 to 1 (2 ways)

        int number=20;
        while (number>=1){
            System.out.print(number+" ");
            number-=2;
        }
        System.out.println();

        for (number=20; number>=1; number-=2){
            System.out.print(number+" ");
        }
    }
}
