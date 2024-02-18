package Book2.Chapter2;

public class EnumTest {

    public enum CardSuit {HEARTS, SPADES, DIAMINDS, CLUBS}

    ;

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;

        System.out.println("The suit is " + suit);
    }
}
