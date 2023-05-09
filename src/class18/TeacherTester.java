package class18;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.talks();

        MathTeacher mt = new MathTeacher();
        mt.name="William";
        mt.yearsOfTenure=10;
        System.out.println("Teacher "+mt.name+" has been teaching Math for "+mt.yearsOfTenure+" years.");

        ChemistryTeacher ct = new ChemistryTeacher();
        ct.height=6.5;
        ct.name="Lovely";
        System.out.println("My Chemistry Teacher is "+ct.height+" feet tall.");
        ct.grading();

        PianoTeacher pt = new PianoTeacher();
        pt.writes();
        pt.checksAttendance();

    }

}
