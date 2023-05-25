package javeGroupProject1;

public class Task1 {
    public static void main(String[] args) {
        /* Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to
        find the highest and lowest temperature for the week. */

        int [][] temperature={
                                {58, 78},
                                {66, 78},
                                {68, 79},
                                {69, 79},
                                {68, 83},
                                {63, 80},
                                {56, 75},
        };
        int lowestTemp=temperature[0][0];
        int highestTemp=temperature[0][1];
        for (int[] row : temperature){
            for (int temp : row) {
                if(temp<lowestTemp){
                    lowestTemp=temp;
                }
                if (temp>highestTemp){
                    highestTemp=temp;
                }
            }
        }
        System.out.println("The highest temperature for the week is: "+highestTemp);
        System.out.println("The lowest temperature for the week is: "+lowestTemp);
    }
}
