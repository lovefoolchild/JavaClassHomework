package class9Arrays;

public class HW5 {
    public static void main(String[] args){
        /* Create  an array of animals and store 5 elements into it.
        Using two different loops print all elements from the array. */
        String [] animals={"dogs", "cats", "alligators", "whales", "manatees"};
        for (int i=0; i< animals.length; i++){
            System.out.print(animals[i]+" ");
        }
        System.out.println();
        int counter=0;
        while (counter< animals.length){
            System.out.print(animals[counter]+" ");
            counter++;
        }
    }
}
