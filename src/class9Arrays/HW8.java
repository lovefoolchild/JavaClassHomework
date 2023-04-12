package class9Arrays;

public class HW8 {
    public static void main(String[] args){
        /* Create an array to store char values and then print those in
        reverse order */
        char [] values={'S', 'I', 'R', 'A', 'P'};
        int counter= values.length-1;
        while (counter>=0){
            System.out.println(values[counter]);
            counter--;
        }
        System.out.println();
        for (int i= values.length-1; i>=0; i--){
            System.out.println(values[i]);
        }
        }
    }

