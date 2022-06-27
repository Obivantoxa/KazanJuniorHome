package lesson7.hw;

public interface VendingMachine {

     void displayProductMessage() ;

     void selectProduct(int product);

     void displayEnterCoinsMessage();

     void enterCoins(int... coins );

     void displayChangeMessage();




}
