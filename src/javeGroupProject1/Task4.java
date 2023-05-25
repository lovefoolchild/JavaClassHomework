package javeGroupProject1;

public class Task4 {
    public static void main(String[] args) {
        /* Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for
        that array. */
        int[][] value={
                {22, 97, 52},
                {19, 15, 46},
                {10, 86, 88},
                {89, 32, 99}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int[] row : value){
            for (int i : row){
                if (i%2==0){
                    sumEven+=i;
                }
                if (i%2==1){
                    sumOdd+=i;
                }
            }
        }
        System.out.println("The sum of all even numbers is: "+sumEven);
        System.out.println("The sum of all odd numbers is: "+sumOdd);
    }
}
