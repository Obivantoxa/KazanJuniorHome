package lesson10;

public class Card {
	private int value;
	private String name;
	public Card(String name, int value) {
		this.value = value;
		this.name = name;
	}
	public Card(){
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void open(){
		 System.out.println(name);
	}
	

}
