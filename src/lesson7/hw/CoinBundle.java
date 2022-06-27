package lesson7.hw;

public class CoinBundle {

    public int number1RublesCoins;
    public int number2RublesCoins;
    public int number5RublesCoins;
    public int number10RublesCoins;

    public CoinBundle(int... enteredCoins){
        this.number1RublesCoins = enteredCoins[0];
        this.number2RublesCoins = enteredCoins[1];
        this.number5RublesCoins = enteredCoins[2];
        this.number10RublesCoins = enteredCoins[3];
    }
    public int getTotal(){
        int total = 0;
        total = total+this.number1RublesCoins * Coin.OneRubles.getValue();
        total = total+this.number2RublesCoins * Coin.TwoRubles.getValue();
        total = total+this.number5RublesCoins * Coin.FiveRuble.getValue();
        total = total+this.number10RublesCoins * Coin.TenRubles.getValue();

        return total;
    }

}
