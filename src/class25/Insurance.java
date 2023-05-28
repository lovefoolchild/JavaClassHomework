package class25;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel
and Class Pet has petType attribute. Create 3 objects of the subclasses and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public interface Insurance {
    String insuranceName="Lovely Cares";

   void getQuote();
   void cancelInsurance();
}

class Car implements Insurance {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("We will get back to you shortly for your Car Insurance quote.");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We are currently cancelling your Car Insurance.");
    }
}

class Pet implements Insurance {
    String petType;

    public Pet(String petType){
        this.petType=petType;
    }
    @Override
    public void getQuote(){
        System.out.println("We will get back to you shortly for your Pet Insurance quote.");
    }

    @Override
    public void cancelInsurance(){
        System.out.println("We are currently cancelling your Pet Insurance.");
    }
}

class Health implements Insurance {

    String category;

    public Health(String category){
        this.category=category;
    }

    @Override
    public void getQuote(){
        System.out.println("We will get back to you shortly for your Health Insurance quote.");
    }

    @Override
    public void cancelInsurance(){
        System.out.println("We are currently cancelling your Health Insurance.");
    }
}