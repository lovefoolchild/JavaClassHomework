package class15;

public class Students {
    /*
    Create a Class called Students
        Create three variables: Name, ID and numberOfStudents
        Create three objects of the Student Class
        Set the value for studentName, studentID, and increment the
            numberOfStudents for each object
        Print out total number of students
     */

    String studentName;
    String studentID;
    static int numberOfStudents;

    public Students(){
        numberOfStudents++;
    }

    public static void main(String[] args) {
        Students student1=new Students();
        student1.studentName="Muffins";
        student1.studentID="C09A19T";

        Students student2=new Students();
        student2.studentName="Jubilee";
        student2.studentID="D04O15G";

        Students student3=new Students();
        student3.studentName="Jubilee";
        student3.studentID="D04O15G";

        System.out.println(Students.numberOfStudents);
    }
}
