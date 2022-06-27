package lesson7.hw;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProductMessage();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();

        int[] enteresCoins = Coin.parseCoins(userEnteredCoins);

        vendingMachine.enterCoins(enteresCoins);
        vendingMachine.displayChangeMessage();

    }


}
