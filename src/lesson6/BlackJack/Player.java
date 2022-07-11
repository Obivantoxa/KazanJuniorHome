package lesson6.BlackJack;

import java.util.Scanner;

public class Player {

    protected Card[] cards = new Card[10];
    private boolean isGame = true;

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public boolean isGame() {
        return isGame;
    }

    public void setGame(boolean game) {
        isGame = game;
    }

    public Player() {

    }

    public Player(Card k1, Card k2) {
        cards[0] = k1;
        cards[1] = k2;

    }



    public void vskritie() {
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] != null) {
                System.out.println(this.cards[i].getName());

            }
        }
    }

    public void addKart(Card k1) {
        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i] == null) {
                this.cards[i] = k1;
                break;
            }
        }
    }

    public boolean needKartaHand() {
        System.out.println("--------------------");
        this.vskritie();
        System.out.println(" Игрок need more card ?");
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        if (res == "+") {
            return true;
        } else return false;

    }
    public int showPlayerValue(){
        int value = 0;
        for ( int i = 0; i<this.cards.length;i++){
            if (this.cards[i]!=null){
                value+=this.cards[i].getValue();
            }
        }
        return value;
    }

}
