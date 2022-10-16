
public class App {

	public static void main(String[] args) {
		Deck allDeck = new Deck ();
		allDeck.shuffle();
		
		Player player1 = new Player("Toby");
		Player player2 = new Player("Poo");
		//players draw 26 cards each
		for (int c = 1; c <= 26; c++) {
			player1.playerHand.add(allDeck.draw());
			player2.playerHand.add(allDeck.draw());
		}
		
		player1.describe();
		player2.describe();
		//players flip 26 cards
		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if (player1Card.getValue()> player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			} else {
				System.out.println("\nDRAW\n");
			}
		}
		/*
		Player 1 card > Player 2 card (Player 1 score increments by 1 point toward their total score)
		Player 2 card > Player 1 card (Player 2 score increments by 1 point toward their total score)
		Player 1 card == Player 2 card (This counts as a draw. Neither player receives a point toward their score)
		Player 2 card == Player 1 card (This counts as a draw. Neither player receives a point toward their score)
		*/
if (player1.score> player2.score) {
	System.out.println(player1.name + "Final score: " + player1.score + "\n");
	System.out.println(player2.name + "Final score: " + player2.score + "\n");
	System.out.println(player1.name + "Wins");
} else if (player2.score > player1.score) {
	System.out.println(player1.name + "Final score: " + player1.score + "\n");
	System.out.println(player2.name + "Final score: " + player2.score + "\n");
	System.out.println(player2.name + "Wins");
} else {
	System.out.println(player1.name + "Final score: " + player1.score + "\n");
	System.out.println(player2.name + "Final score: " + player2.score + "\n");
	System.out.println("Tie! No Winner");
}
	}

}
