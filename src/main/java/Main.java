public class Main {
    public static void main (String[]args){
        Card card1 = new Card("Ace", "Spades", 6);
        System.out.println("card 1: " + card1);

        Card card2 = new Card("King", "Spades", 6);
        System.out.println("card 1 = card 2 " + card1.equals(card2));

        Deck fullDeck = new Deck();
        System.out.println("Full deck size: " + fullDeck.size());

        Card topCard = fullDeck.draw();
        System.out.println("Drew: " + topCard);
        System.out.println("Deck size afterd draw: " + fullDeck.size());

        fullDeck.shuffle();
        Card randomCard = fullDeck.draw();
        System.out.println("Draw card after shuffle: " + randomCard);
        System.out.println("Deck size now: " + fullDeck.size());

        while (fullDeck.size() > 0) {
            fullDeck.draw();
        }
        System.out.println("Deck size after emptying: " + fullDeck.size()); 
        System.out.println("Try drawing from empty deck: " + fullDeck.draw()); 
        Card[] customCards = {
            new Card("Ace", "Spades", 1),
            new Card("10", "Clubs", 10)
        };
        Deck customDeck = new Deck(customCards);
        System.out.println("Custom deck size: " + customDeck.size()); 
        System.out.println("Draw from custom deck: " + customDeck.draw());
    }
}
