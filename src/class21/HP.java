package class21;

public class HP extends Computers{

    HP(String name, String model, double screenSize) {
        super(name, model, screenSize);
    }

    @Override
    void printInfo(){
        System.out.println(name+" "+model+" with "+screenSize+" monitor size.");
    }

    @Override
    void solve(){
        System.out.println("HP computers have a built in calculator.");
    }
    @Override
    void communicate(){
        System.out.println("HP enables us to access apps and websites to connected with the world.");
    }
    @Override
    void entertain(){
        System.out.println("HP enables us to access sites and apps to play games.");
    }

    void durable(){
        System.out.println("HP computers are very durable.");
    }
}
