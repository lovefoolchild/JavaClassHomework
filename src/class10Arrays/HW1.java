package class10Arrays;

public class HW1 {
    public static void main(String[] args) {
        /* Create a 2D array(shorter way) in which first array will consist
        of 4 names and second array will contain grades. Then your program
        should print name of the students that has A and B grade */
        String [][] studentsGrades = {
                    {"Taco", "Buster", "Muffins", "Jubilee"},
                    {"A", "B", "A", "B"}
        };
        for (int i=0; i< studentsGrades[0].length; i++) {
            if (studentsGrades[1][i].equals("A")) {
                System.out.println(studentsGrades[0][i]+" got an A grade.");
            } else if (studentsGrades[1][i].equals("B")){
                System.out.println(studentsGrades[0][i]+" got a B grade.");
            }
        }
    }
}
