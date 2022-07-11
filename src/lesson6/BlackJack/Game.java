package lesson6.BlackJack;

import lesson10.Dealer;

import java.util.ArrayList;


public class Game implements IGame {

    //private Player[] massivePlayers = new Player[5];
    private ArrayList<Player> playersArr = new ArrayList();
    private Koloda koloda = new Koloda();

    public Game(Player player) {
        playersArr.add(player);
        //massivePlayers[0]=player;
    }

    @Override
    public void addPlayer(Player player) {
        //MassivePlayers[0] = player;
//      for (Player p : massivePlayers){
//          if (p == null){
//              p=player;
//              return;
//          }
////      }
        playersArr.add(player);
    }

    @Override
    public void addTwoKartaToPlayer() {
        for (Player p : playersArr) {
            p.addKart(this.koloda.getsRandomCard());
            p.addKart(this.koloda.getsRandomCard());
        }

    }

    @Override
    public void needMoreKarta() {
        for (Player p : playersArr) {

            while (p.needKartaHand()) {
                if (p instanceof Diller) {
                    p.addKart(this.koloda.getsRandomCard());
                }
            }

        }
    }

    @Override
    public void printToWin() {

        int count = 0;
        for (Player player : playersArr) {
            if (player.showPlayerValue() > 21) {
                player.setGame(false);

            } else {
                count++;
            }
        }
        int winValue = 0;
        if (count > 0) {
            if (count == 1) {
                for (Player player : playersArr) {
                    if (player.isGame()) {
                        player.vskritie();
                        System.out.println("победил единственный игрок");
                        return;
                    }
                }


            } else {
                for (Player player : playersArr) {
                    if (winValue < player.showPlayerValue())
                        winValue += player.showPlayerValue();
                }
            }
            for (Player player : playersArr){
                if (winValue == player.showPlayerValue()){
                    System.out.println("Pobeditelb ");
                    player.vskritie();
                }
            }
            System.out.println("dealer win");
        }


    }
}




