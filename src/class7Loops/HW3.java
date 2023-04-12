package class7Loops;

public class HW3 {
    public static void main(String[] args) {
        // Print odd numbers between 20 and 50 (2 ways)

        int number = 20;
        while (number <= 50) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();

        for (number=20; number<=50; number++) {
            if (number%2==1){
                System.out.print(number+" ");
            }
        }
    }
}
