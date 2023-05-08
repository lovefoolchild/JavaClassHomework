package class17;

public class FourConstructorsTest {
    public static void main(String[] args) {
        // FourConstructors constructor1 = new FourConstructors(); - cannot be executed since constructor is private
        FourConstructors constructor2 = new FourConstructors("Public");
        FourConstructors constructor3 = new FourConstructors(1);
        FourConstructors constructor4 = new FourConstructors('.');
    }
}
