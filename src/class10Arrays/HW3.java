package class10Arrays;

public class HW3 {
    public static void main(String[] args) {
        /* Using 2D array create a grocery list. Inside you should have an array of
        veggies, fruits, dairy and sweets. Retrieve all values from that array using
        2 different loops */

        String [][] grocery={
                                {"Tomatoes", "Carrots", "Potatoes"},
                                {"Peaches", "Strawberries", "Mangoes"},
                                {"Milk", "Yogurt", "Cream Cheese"},
                                {"Dark Chocolates", "Gelato", "Danish"}
        };
        for (String[] groceryList : grocery){
            for (String list : groceryList){
                System.out.print(list+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int a=0; a< grocery.length; a++){
            String[] arr1 = grocery[a];
            for (int b=0; b< arr1.length; b++){
                System.out.print(arr1[b]+" ");
            }
            System.out.println();
        }
    }
}
