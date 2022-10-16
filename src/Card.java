
public class Card {
		private int value;
		String name;
		
		public Card(int value, String name) {
			this.value = value;
			this.name = name;
		}
public void describe() {
	System.out.println("Name of card: " + name + "Value of card is: " + value);
}
//getter and setter for value of card
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
//getter and setter for Name of card
public String getName( ) {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
