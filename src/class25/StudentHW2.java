package class25;

import java.util.TreeSet;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class StudentHW2 {

    private String name;
    private String id;

    public StudentHW2(String name, String id){
        this.name=name;
        this.id=id;
    }

    public String printInfo() {
        return name+" "+id;
    }


    public static void main(String[] args) {
        StudentHW2 studentA = new StudentHW2("Paul", "M0123");
        StudentHW2 studentB = new StudentHW2("Ozgur", "A0105");
        StudentHW2 studentC = new StudentHW2("Meg", "N1805");
        StudentHW2 studentD = new StudentHW2("Patty", "T1205");
        StudentHW2 studentE = new StudentHW2("Kenny", "F2105");

        TreeSet<String> student = new TreeSet<>();
        student.add(studentA.printInfo());
        student.add(studentB.printInfo());
        student.add(studentC.printInfo());
        student.add(studentD.printInfo());
        student.add(studentE.printInfo());
        System.out.println(student);
    }
}
