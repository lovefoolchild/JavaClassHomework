package class21;

public class Apple extends Computers{

    String processor;
    Apple(String name, String model, double screenSize){
        super(name, model, screenSize);
        this.processor="M1";
    }
    @Override
    void printInfo(){
        System.out.println(name+" "+model+" with "+processor+" processor");
    }
    @Override
    void solve(){
        System.out.println("Apple computers have a built in calculator.");
    }
    @Override
    void communicate(){
        System.out.println("Apple computers have a built in iMessage and FaceTime.");
    }
    @Override
    void entertain(){
        System.out.println("Apple has its own Apple TV.");
    }

    void createMusic(){
        System.out.println("Apple enables you to create and edit music through their GarageBand software.");
    }
}
