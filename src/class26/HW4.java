package class26;

import java.util.ArrayList;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class HW4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(15);
        integers.add(19);
        integers.add(89);
        integers.add(5);
        integers.add(15);

        int sum = 0;
        for (var number : integers){
            sum+=number;
        }
        System.out.println("Sum of all integers: "+sum);
    }
}
