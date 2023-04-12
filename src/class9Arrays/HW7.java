package class9Arrays;

public class HW7 {
    public static void main(String[] args){
        /* From an array of integer elements find the largest number. */
        int [] numbers={100, 250, 300, 450, 400, 1500};
        int largestNumber=0;
        for (int i=0; i< numbers.length; i++){
            if (numbers[i]>largestNumber) {
                largestNumber=numbers[i];
            }
        }
        System.out.println(largestNumber);
    }
}
