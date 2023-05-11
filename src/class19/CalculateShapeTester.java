package class19;

public class CalculateShapeTester {
    public static void main(String[] args) {
        CalculateShape square = new CalculateShape();
        System.out.println(square.calculateArea(15));
        CalculateShape rectangle = new CalculateShape();
        System.out.println(rectangle.calculateArea(15,10));
    }
}
