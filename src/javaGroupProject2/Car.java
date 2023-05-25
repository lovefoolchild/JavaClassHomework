package javaGroupProject2;

/*
    Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
        which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight and has its own implementation of
        calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then returned
        price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation of calculateSalePrice():
        if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public class Car {
    double carPrice = 35750.99;
    String color;

    double calculateSalePrice(){
        this.carPrice=carPrice;
        return carPrice;
    }
}

class Sedan extends Car {
    int length = 17;

    @Override
    double calculateSalePrice() {
        this.carPrice=carPrice;
        if (length>20) {
            return carPrice - (carPrice * 0.05);
        } else {
            return carPrice - (carPrice * 0.1);
        }
    }
}

class Truck extends Car{
    int weight = 1500;
    @Override
    double calculateSalePrice(){
        this.carPrice=carPrice;
        if (weight>2000) {
            return carPrice - (carPrice * 0.1);
        } else {
            return carPrice - (carPrice * 0.2);
        }
    }
}

class CarTester {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.carPrice);

        Sedan sedan = new Sedan();
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck();
        System.out.println(truck.calculateSalePrice());
    }
}