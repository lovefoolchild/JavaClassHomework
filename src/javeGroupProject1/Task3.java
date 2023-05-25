package javeGroupProject1;

public class Task3 {
    public static void main(String[] args) {
        /* Create a 2D array of an integer type where you will store odd and even numbers. Develop a program which
        will identify/print the even numbers only. */
        int[][] value={
                      {22, 97, 52},
                      {19, 15, 46},
                      {10, 86, 88},
                      {89, 32, 99}
        };
        for (int[] row : value){
            for (int i : row){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }
    }
}
