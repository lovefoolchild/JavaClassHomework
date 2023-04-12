package class9Arrays;

public class HW6 {
    public static void main(String[] args){
        /* Create an array of integers and calculate the sum of all
        elements in an array. */
        int [] numbers={100, 250, 300, 450, 400};
        int sum=0;
        for (int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];
        } System.out.print(sum);
    }
}
