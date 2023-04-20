package groupProject2;

public class Task6 {
    public static void main(String[] args) {
        /* Write a java program to check whether a given number is prime or not? */
        int primeCheck = 15;
        boolean statement = false;
        for (int i = 2; i <= primeCheck / 2; i++) {
            if (primeCheck % i == 0) {
                statement = true;
                break;
            }
        }
        if (!statement) {
            System.out.println(primeCheck + " is a prime number.");
        } else {
            System.out.println(primeCheck + " is not a prime number.");
        }
    }
}


