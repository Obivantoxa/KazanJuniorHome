package lesson6.BlackJack;

public class Main {
    public static void main(String[] args) {

        Diller d = new Diller();
        Player player1 = new Player();

        Game blackdjek = new Game(d);
        blackdjek.addPlayer(player1);

        blackdjek.addTwoKartaToPlayer();
       // blackdjek.addTwoKartaToPlayer(player1);

        blackdjek.needMoreKarta();


        blackdjek.printToWin();

    }


}
