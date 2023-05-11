package class19;

/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
class WithPrivateMethod {

    private void myMethod(String word, int num){
        System.out.println("First form of myMethod:"+" "+word+" "+num);
    }

    private void myMethod(int num){
        System.out.println("Second form of myMethod:"+" "+num);
    }
    private void myMethod(String word){
        System.out.println("Third form of myMethod"+" "+word);
    }

    public static void main(String[] args) {
        WithPrivateMethod hw = new WithPrivateMethod();
        hw.myMethod("May", 15);
        hw.myMethod(15);
        hw.myMethod("May");
    }
}

