package class10Arrays;

public class HW4 {
    public static void main(String[] args) {
        /* Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers. */
        int[][] numbers={
                        {5, 15, 89},
                        {10, 12, 88},
                        {1, 15, 9}
        };
        int sum=0;
        for (int [] row : numbers){
            for (int num : row){
            sum+=num;
            }
        }
        System.out.println(sum);
    }
}
