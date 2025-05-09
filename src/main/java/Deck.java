import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Represents a deck of playing cards.
 * Can be created with a custom list of cards or as a standard 52-card deck.
 */
public class Deck  {  
    //array list to hold cards in the deck

    private ArrayList<Card> cards;
    /**
     * Constructor that accepts an array of cards and adds them to the deck.
     * Overloaded constructor: same name, different parameters.
     * @param cardArray an array of Card objects to be added to the deck
     */

    public Deck (Card[] cardArray){
        cards = new ArrayList<>(); //creates an empty list
        for (Card c: cardArray){
            cards.add(c);
        }
    }

       /**
     * Default constructor that creates an unshuffled standard 52-card deck.
     * It includes 4 suits and 13 cards per suit.
     */
    public Deck (){
        //initialize the array list 
        cards = new ArrayList<>();

        //create array of type String holding suits
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};

        //create array of type String holding names of cards
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //create a loop to go through each suit
        for(String suit: suits ){
            //loop through each card name and assigned value
            for(int i = 0; i < names.length; i++){
                Card newCard = new Card(names[i], suit, i+1);
                cards.add(newCard);
         }
    }
   
}
    /**
     * Returns the number of cards currently in the deck.
     * @return the size of the deck
     */
public int size(){
    return cards.size();
}

    /**
     * Removes and returns the top card of the deck.
     * If the deck is empty, returns null.
     * @return the top card of the deck or null if the deck is empty
     */
public Card draw(){
    //if deck is empty retun null
    if(cards.isEmpty()){
        return null;
    }
    //remove and return last card in the list
    return cards.remove(cards.size()-1);
}   

    /**
     * Randomly shuffles the order of the cards in the deck.
     */
public void shuffle(){
    Collections.shuffle(cards);
}

}