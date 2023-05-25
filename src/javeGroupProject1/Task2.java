package javeGroupProject1;

public class Task2 {
    public static void main(String[] args) {
        /* Create an array of integer values. After the array is created, calculate the sum of all stored elements in
        that array. */
        int [][] value={
                       {561, 851, 90},
                       {165, 581, 70},
                       {651, 158, 80},
        };
        int sum=0;
        for (int[] row : value){
            for (int i : row){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
