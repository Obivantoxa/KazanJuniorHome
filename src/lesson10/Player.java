package lesson10;

import java.util.Scanner;

public class Player {

	private String name;

	private Card[] playerMassiveCard = new Card[10];
	
	private boolean inGame = true; // состояние игрока 

	public boolean isInGame() {
		return inGame;
	}


	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}


	public Player() {

	}
	

	public Player(String name) {
		this.name = name;
	}


	public Player(Card k1, Card k2) {
		playerMassiveCard[0] = k1;
		playerMassiveCard[1] = k2;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void vskritie() {
		for (int i = 0; i < playerMassiveCard.length; i++) {
			if (this.playerMassiveCard[i] != null) {
				System.out.println(this.playerMassiveCard[i].getName());
			}
		}
	}

	public void addKarta(Card k1) {
		for (int i = 0; i < this.playerMassiveCard.length; i++) {
			if (this.playerMassiveCard[i] == null) {
				this.playerMassiveCard[i] = k1;
				break;
			}
		}
	}

	public boolean needMoreKarta(Player player) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(player.getName() + ", ваши карты: ");
		this.vskritie();
		System.out.println("-----------------");
        System.out.println("Need more cards?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            return true;
        }
        return false;
    }
	
	public int showPlayerValue(){
		int value = 0;
		for (int i = 0; i < playerMassiveCard.length; i++) {
			if (this.playerMassiveCard[i] != null) {
				value += this.playerMassiveCard[i].getValue();
			}
		}
		return value;
		
	}


	
	

}
