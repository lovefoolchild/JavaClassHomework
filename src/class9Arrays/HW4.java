package class9Arrays;

public class HW4 {
    public static void main(String[] args){
        /* Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array. */
        String [] cars={"Porsche", "Mclaren", "Bentley", "Maserati", "Bugatti", "Audi"};
        for (int i=0; i< cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        int counter=0;
        while (counter<cars.length){
            System.out.print(cars[counter]+" ");
            counter++;
        }
    }
}

