package lesson10;

import java.util.Scanner;

public class Game implements IGame {

    private Player[] massivePlayers = new Player[1];
    private Koloda koloda = new Koloda();
    private String name;

    public Game(Player player) {
        massivePlayers[0] = player;
    }

    @Override
    public void addPlayer(Player player) {
        for (int i = 0; i < massivePlayers.length; i++) {
            if (massivePlayers[i] == null) {
                massivePlayers[i] = player;
                return;
            }
        }
    }

    @Override
    public void addTwoKartaToPlayer(Player player) {
        for (Player p : massivePlayers) {
            player.addKarta(koloda.getsRandomCard());
            player.addKarta(koloda.getsRandomCard());
            return;
        }
    }


    @Override
    public void addKartaToPlayer(Player player) {
        for (Player p : massivePlayers) {
            if (p instanceof Player) {
                while (player.needMoreKarta(player)) {
                    player.addKarta(koloda.getsRandomCard());
                    break;
                }
            }
        }
    }

    public void addKartaToDealer(Dealer d) {
        for (Player p : massivePlayers) {
            if (p instanceof Dealer) {
                while (d.needMoreKartaDealer(d)) {
                    d.addKarta(koloda.getsRandomCard());
                    break;
                }
            }
        }
    }

    @Override
    public void printToWin() {
        // 21  21  34  19  18 // 21 21
        // 19  22  34  19  18 // 20
        // 23  25  34  22  24 // крупье
        // 23  25  34  22  24 // крупье
        // устанавливаем флаг не в игрее у кого перебор
        for (int i = 0; i < massivePlayers.length; i++) {
            Player player = massivePlayers[i];
            if (player.showPlayerValue() > 21 && player != null) {
                player.setInGame(false);
            }
        }
        //если у всех перебор выйграл крупье 
        if (countPlayerInGame() == 0) {
            for (Player player : massivePlayers) {
                if (player instanceof Dealer) {
                    System.out.println("------winner " + player.getName());
                    player.vskritie();
                }
            }
        }
        //узнаnm  какое число выгрышное
        //21 20 10    18  19  числа не больше 21  и  кинуть его в переменную
        int winnerValue = 0;
        for (Player player : massivePlayers) {
            if (player.isInGame() && player.showPlayerValue() > winnerValue) {
                winnerValue = player.showPlayerValue();
            }
        }
        for (Player player : massivePlayers) {
            if (player.isInGame() && player.showPlayerValue() == winnerValue) {
                System.out.println("------winner " + player.getName());
                player.vskritie();
            }

        }

    }

    private int countPlayerInGame() {  // подсчет игроков в игре
        int count = 0;
        for (Player player : massivePlayers) {
            if (player.isInGame()) {
                count++;
            }
        }
        return count;
    }


}
