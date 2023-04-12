package class9Arrays;

public class HW1 {
    public static void main(String[] args) {
        /* Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an
        array). */

        char [] grade={'A', 'B', 'C', 'D'};
        System.out.println(grade[1]);

        System.out.println();

        char [] gradeByLetter = new char[4];
        gradeByLetter[0]='A';
        gradeByLetter[1]='B';
        gradeByLetter[2]='C';
        gradeByLetter[3]='D';
        System.out.println(gradeByLetter[1]);
    }
}
