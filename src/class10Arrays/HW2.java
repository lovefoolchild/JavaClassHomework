package class10Arrays;

public class HW2 {
    public static void main(String[] args) {
        /* Create 2D array of cars : american, german, korean, italian. Then retrieve
        all values from that array using 2 different loops */
        String [][] cars={
                         {"Ford", "Chevrolet"},
                         {"Volkswagen", "Audi"},
                         {"Kia", "Hyundai"},
                         {"Lamborghini", "Ferrari"}
        };
        for (int a=0; a< cars.length; a++){
            String [] arr1 = cars[a];
            for (int b=0; b<arr1.length; b++){
                System.out.print(arr1[b]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (String[] rowOfCars : cars){
            for (String car : rowOfCars) {
                System.out.print(car+" ");
            }
            System.out.println();
        }
        }
        }


