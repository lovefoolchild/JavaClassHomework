package class18;

/*
Write a Java program called Teacher. Identify features and 4 behaviors of that class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher. Test all 4 classes.
 */
public class Teacher {
    String name;
    double height;
    int yearsOfTenure;

    void talks(){
        System.out.println("Teacher is giving a lecture.");
    }
    void grading(){
        System.out.println("Teacher "+name+" is grading the quiz.");
    }
    void writes(){
        System.out.println("Teacher is writing the assignment for next class.");
    }
    void checksAttendance(){
        System.out.println("Teacher is checking the attendance.");
    }

}
