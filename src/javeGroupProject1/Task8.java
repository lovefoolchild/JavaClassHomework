package javeGroupProject1;

public class Task8 {
    public static void main(String[] args) {
        /* Maximum and minimum number in the array? */
        int [][] numbers={
                {58, 78, 58},
                {66, 78, 78},
                {68, 79, 65},
                {69, 79, 60},
                {68, 83, 57},
                {63, 80, 69},
                {56, 75, 84}
        };
        int minNum=numbers[0][0];
        int maxNum=numbers[0][0];
        for (int[] row : numbers){
            for (int a : row){
                if (a<minNum){
                    minNum=a;
                }
                if (a>maxNum){
                    maxNum=a;
                }
            }
        }
        System.out.println(minNum);
        System.out.println(maxNum);
    }
}
