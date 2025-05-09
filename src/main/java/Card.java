/**
 * Represents a playing card with a name, suit, and value.
 */
public class Card{
    
public String name;
public String suit;
public int value;

 /**
     * Gets the name of the card.
     * @return the name of the card
     */
public String getName(){
   return name; 
}

 /**
     * Gets the suit of the card.
     *   * @return the suit of the card
     * */
public String getSuit(){
    return suit;
}

    /**
     * Gets the value of the card.
     * @return the value of the card
     */
public int getValue(){
    return value;
}

   /**
     * Constructs a Card object with a name, suit, and value.
     * @param name the name of the card
     * @param suit the suit of the card
     * @param value the value of the card
     */
public Card(String name, String suit, int value){
    this.name = name;
    this.suit = suit;
    this.value = value;

}

    /**
     * Returns a string representation of the card.
     * @return a string in the format "Name of Suit"
     */
@Override    
public String toString(){
    return name + " of " + suit;
}

    /**
     * Checks if this card is equal to another card.
     * Cards are equal if name, suit, and value are all the same.
     * @param otherCard the card to compare with
     * @return true if both cards are the same, false otherwise
     */
public boolean equals(Card otherCard){

if(otherCard == null) 
return false;
 
//checks if name, suit, and value are equal or not.
if(this.name.equals(otherCard.name) && this.suit.equals(otherCard.suit) && this.value == otherCard.value){
    return true;
}
    return false;     

 }

}