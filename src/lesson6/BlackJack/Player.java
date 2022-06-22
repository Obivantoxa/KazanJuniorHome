package lesson6.BlackJack;

public class Player {

    private Card[] cards = new Card[10];

    public Player(Card k1, Card k2){
        cards[0]=k1;
        cards[1]=k2;

    }

    public void vskritie(){
        for (int i = 0; i<this.cards.length;i++){
            if (this.cards[i]!=null){
                System.out.println(this.cards[i].getName());

            }
        }
    }
    public void addKart(Card k1){
        for (int i = 0; i<this.cards.length;i++){
            if (this.cards[i]==null){
                this.cards[i]=k1;
                break;
            }
        }
    }

}
