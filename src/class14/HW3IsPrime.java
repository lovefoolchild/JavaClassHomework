package class14;

public class HW3IsPrime {
    /*
    Write a method to return whether given number is prime or not?
     */
    boolean primeCheck(int number){
        if (number<=1){
            return false;
        }
        for (int i=2; i<number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        HW3IsPrime obj=new HW3IsPrime();
        int number=24;
        System.out.println(obj.primeCheck(number));
    }
}
