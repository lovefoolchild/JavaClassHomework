package class20;

public class DegreeTester {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getPrerequisite();

        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();

        Masters masters = new Masters();
        masters.getPrerequisite();
    }
}
