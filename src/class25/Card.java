package class25;

import java.util.LinkedList;

/*
Create a Card class that will have interest rate field and card type and a constructor that will initialize the fields.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }


    public static void main(String[] args) {
        Card card1 = new Card(9.99, "Visa Cash Back");
        Card card2 = new Card(11.79, "Mastercard Travel Rewards");
        Card card3 = new Card(15.69, "American Express Rewards Points");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (Card card : cards) {
            System.out.println("Credit Card Type: "+ card.cardType);
            System.out.println("Credit Card Interest Rate: "+ card.interestRate);
        }
    }
}

