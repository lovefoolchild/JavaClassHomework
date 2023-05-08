package class17;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1 = new Students("Patty", 95,89,94);
        Students student2 = new Students("Gladys", 92,90,85);
        Students student3 = new Students("Zach", 97,93,90);
        Students student4 = new Students("Russell", 99,85,92);
        Students student5 = new Students("Lovely", 95,85,90);
        student1.calculateAverageGrade();
        student2.calculateAverageGrade();
        student3.calculateAverageGrade();
        student4.calculateAverageGrade();
        student5.calculateAverageGrade();
    }
}
