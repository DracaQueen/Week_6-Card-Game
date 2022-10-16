
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
 private List<Card> cards = new ArrayList<Card>();

public Deck () { 
	//Hearts 
	cards = List.of(new Card(2, "Two of Hearts"),new Card(3, "Three of Hearts"),new Card(4, "Four of Hearts"),new Card(5, "Five of Hearts"),
			new Card(6, "Six of Hearts"),new Card(7, "Seven of Hearts"),new Card(8, "Eight of Hearts"),new Card(9, "Nine of Hearts"),
			new Card(10, "Ten of Hearts"), new Card(11, "Jack of Hearts"),new Card(12, "Queen of Hearts"),new Card(13, "King of Hearts"),new Card(14, "Ace of Hearts"),
			//Clubs 
			new Card(2, "Two of Clubs"),new Card(3, "Three of Clubs"),new Card(4, "Four of Clubs"),new Card(5, "Five of Clubs"),
			new Card(6, "Six of Clubs"),new Card(7, "Seven of Clubs"),new Card(8, "Eight of Clubs"),new Card(9, "Nine of Clubs"),
			new Card(10, "Ten of Clubs"),new Card(11, "Jack of Clubs"),new Card(12, "Queen of Clubs"),new Card(13, "King of Clubs"),new Card(14, "Ace of Clubs"),
			//Diamonds 
			new Card(2, "Two of Diamonds"),new Card(3, "Three of Diamonds"),new Card(4, "Four of Diamonds"),new Card(5, "Five of Diamonds"),
			new Card(6, "Six of Diamonds"),new Card(7, "Seven of Diamonds"),new Card(8, "Eight of Diamonds"),new Card(9, "Nine of Diamonds"),
			new Card(10, "Ten of Diamonds"),new Card(11, "Jack of Diamonds"),new Card(12, "Queen of Diamonds"),new Card(13, "King of Diamonds"),new Card(14, "Ace of Diamonds"),
			//Spades 
			new Card(2, "Two of Spades"),new Card(3, "Three of Spades"),new Card(4, "Four of Spades"),new Card(5, "Five of Spades"),
			new Card(6, "Six of Spades"),new Card(7, "Seven of Spades"),new Card(8, "Eight of Spades"),new Card(9, "Nine of Spades"),
			new Card(10, "Ten of Spades"),new Card(11, "Jack of Spades"),new Card(12, "Queen of Spades"),new Card(13, "King of Spades"),new Card(14, "Ace of Spades"));
}

//getter
public List<Card> getCards() {
	return cards;
}
//setter
public void setCards(List<Card> cards) {
	this.cards = cards;
}
//shuffle method to shuffle the cards
public void shuffle() {
	Collections.shuffle(cards);
}
//draws a card from the deck
public Card draw() {
	if (cards.isEmpty()) {
		return null;
	}else {
		Card topCard = cards.get(0);
		cards.remove(0);
		return topCard;
	}
	
}
	
	
}
	

