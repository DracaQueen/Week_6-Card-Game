import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {//Player in the game
	
	List<Card> playerHand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player (String name) {
		this.score = 0;
		this.name = name;
	}
	public void describe() {
		System.out.println("\nPlayer " + name + "has" + score + "points\n");
		for (Card card : playerHand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card topCard = playerHand.get(0);
		playerHand.remove(0);
		return topCard;
	}
	public void draw(Deck deck) {
		Card card = deck.draw();
		playerHand.add(card);
	}
	//increases the score by point
	public void incrementScore() {
		this.score++;
	}
	
	
}
