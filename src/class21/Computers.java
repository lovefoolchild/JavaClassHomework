package class21;

    /*  Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some methods in child classes.
    Define some methods specific to child classes.
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
    */

public class Computers {
    String name;
    String model;
    double screenSize;
    Computers(String name, String model, double screenSize){
        this.name=name;
        this.model=model;
        this.screenSize=screenSize;
    }

    void printInfo(){
        System.out.println(name+" "+model+" with "+screenSize+" monitor size.");
    }
    void solve(){
        System.out.println("Computers can help us calculate faster.");
    }

    void communicate(){
        System.out.println("Computers helps us to communicate all over the world.");
    }

    void entertain(){
        System.out.println("There are many ways that computers provide entertainment like playing games.");
    }
}
