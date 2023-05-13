package class21;

public class ComputersTester {
    public static void main(String[] args) {
        Computers[] computers = new Computers[4];
        computers[0]=new Apple("Mac", "Studio", 27);
        computers[1]=new Lenovo("ThinkCentre", "M90a",23.8);
        computers[2]=new HP("HP Envy", "34-c1070xt", 34);
        computers[3]=new Dell("Dell", "Inspiron", 27);

        for (Computers comp : computers){
            comp.printInfo();
            comp.solve();
            comp.communicate();
            comp.entertain();
        }
        System.out.println();
        Apple apple = new Apple("Mac", "Studio", 27);
        if (apple instanceof Apple){
            ((Apple)apple).createMusic();
        } else {
            System.out.println("Wrong type of object is present in syntax variable, typecasting will fail");
        }
        System.out.println();
        Lenovo lenovo = new Lenovo("ThinkCentre", "M90a",23.8);
        if (lenovo instanceof Lenovo){
            ((Lenovo)lenovo).access();
        } else {
            System.out.println("Wrong type of object is present in syntax variable, typecasting will fail");
        }
        System.out.println();
        HP hp = new HP("HP Envy", "34-c1070xt", 34);
        if (hp instanceof HP){
            ((HP)hp).durable();
        } else {
            System.out.println("Wrong type of object is present in syntax variable, typecasting will fail.");
        }
        System.out.println();
        Dell dell = new Dell("Dell", "Inspiron", 27);
        if (dell instanceof Dell){
            ((Dell)dell).use();
        } else {
            System.out.println("Wrong type of object is present in syntax variable, typecasting will fail.");
        }
    }
}
