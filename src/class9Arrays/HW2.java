package class9Arrays;

public class HW2 {
    public static void main(String[] args){
        /* Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of
        creating an array). */

        String [] names={"Buster", "Taco", "Lovely", "Jubilee", "Muffins"};
        System.out.println(names[2]);

        System.out.println();

        String [] beautifulNames = new String[5];
        beautifulNames[0]="Buster";
        beautifulNames[1]="Taco";
        beautifulNames[2]="Lovely";
        beautifulNames[3]="Jubilee";
        beautifulNames[4]="Muffins";
        System.out.println(beautifulNames[2]);
    }
}
