package class19;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class WithStaticMethod {
    static void myMethod(String word, int num){
        System.out.println("First form of myMethod:"+" "+word+" "+num);
    }
    static void myMethod(int num){
        System.out.println("Second form of myMethod:"+" "+num);
    }
    static void myMethod(String word){
        System.out.println("Third form of myMethod"+" "+word);
    }

    public static void main(String[] args) {
        WithStaticMethod hw3 = new WithStaticMethod();
        hw3.myMethod("May", 15);
        hw3.myMethod(15);
        hw3.myMethod("May");
    }
}
