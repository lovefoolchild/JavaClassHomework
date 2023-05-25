package javaGroupProject2;

/*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
    three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
 */
public interface Marks {
    void getPercentage();
}

class StudentA implements Marks {

    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;

    StudentA(int mathGrade, int scienceGrade, int englishGrade) {
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.englishGrade=englishGrade;
    }
    @Override
    public void getPercentage(){
        int average = (mathGrade + scienceGrade + englishGrade) / 3;
        System.out.println("The average mark of Student A is: "+average);
    }
}

class StudentB implements Marks {

    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;
    private int historyGrade;

    StudentB(int mathGrade, int scienceGrade, int englishGrade, int historyGrade) {
        this.mathGrade=mathGrade;
        this.scienceGrade=scienceGrade;
        this.englishGrade=englishGrade;
        this.historyGrade=historyGrade;
    }
    @Override
    public void getPercentage(){
        int average = (mathGrade + scienceGrade + englishGrade + historyGrade) / 4;
        System.out.println("The average mark of Student B is: "+average);
    }
}

class MarksTester {
    public static void main(String[] args) {
        Marks marksStudA = new StudentA(90,92,85);
        marksStudA.getPercentage();
        Marks marksStudB = new StudentB(88, 89, 92,93);
        marksStudB.getPercentage();
    }
}