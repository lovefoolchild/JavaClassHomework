package class10Arrays;

public class HW5 {
    public static void main(String[] args) {
        /* Create a 2D array of integer type where you will store odd and even numbers
        in 3 rows and 4 columns. Develop a program which will identify/print the even
        numbers only. */
        int[][] numbers={
                {5, 12, 89, 88},
                {10, 12, 11, 7},
                {1, 18, 9, 16}
        };
        for (int [] row : numbers){
            for (int num : row){
                if (num%2==0) {
                    System.out.print(num+" ");
                }
            }
        }
    }
}
