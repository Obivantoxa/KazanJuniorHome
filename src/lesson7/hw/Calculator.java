package lesson7.hw;

public interface Calculator {

    int calculateTotal(CoinBundle enteredCoins);

    CoinBundle calculateChange(int amountMoneyToReturn);

}
