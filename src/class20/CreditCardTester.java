package class20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.calculateInterest();

        Visa visa = new Visa();
        visa.calculateInterest(200000, 5.5);

        AX ax = new AX();
        ax.calculateInterest(200000, 5.5);
    }
}
