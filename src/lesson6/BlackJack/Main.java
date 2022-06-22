package lesson6.BlackJack;

public class Main {
    public static void main(String[] args) {

        Koloda koloda = new Koloda();

        Player player1 = new Player(koloda.getsRandomCard(),koloda.getsRandomCard());

        player1.vskritie();
        player1.addKart(koloda.getsRandomCard());





    }


}
