package class21;

public class Dell extends Computers{

    Dell(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }

    @Override
    void printInfo(){
        System.out.println(name+" "+model+" with "+screenSize+" monitor size.");
    }

    @Override
    void solve(){
        System.out.println("Dell computers have a built in calculator.");
    }
    @Override
    void communicate(){
        System.out.println("Dell enables us to access apps and websites to connected with the world.");
    }
    @Override
    void entertain(){
        System.out.println("Dell enables us to access sites and apps to play games.");
    }

    void use(){
        System.out.println("Many companies purchase Dell Computers for their office use.");
    }
}
