package lesson7.hw;

public class TextBasedVendingMachine implements VendingMachine{

    private int selectedProduct;
    public CoinBundle change;
    @Override
    public void displayProductMessage() {
        System.out.println("**************************************");
        System.out.println("******WELCOME TO VENDING MACHINE******");
        System.out.println("**************************************");

        System.out.println("*********Products available:**********");
        System.out.println("                                      ");
        for(Product product:Product.values()){
            System.out.println("      "+product.getId()+" "+ product.name()+" - Price: "+product.getPrice());
        }
        System.out.println("                                      ");
        System.out.println("Please select your product");

    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;

    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println("Please enter coins as follows: ");
        System.out.println("num of 1 ruble coins, num of 2 ruble coins, num of 5 ruble coins, num of 10 ruble coins ");
        System.out.println("                               ");
        System.out.println("Example: If you would like to enter 2 ten ruble coins: 0,0,0,2");
        System.out.println("Please enter coins: ");
    }

    @Override
    public void enterCoins(int... coins) {
        Calculator calculator = new SimpleCalculator();
        Product product = Product.valueOf(this.selectedProduct);
        int total = calculator.calculateTotal(new CoinBundle(coins));
        int changeAmount = total - product.getPrice();
        this.change = calculator.calculateChange(changeAmount);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                          ");
        System.out.println("your change is : "+ change.getTotal() + "rubles splitted as follows: ");
        System.out.println("  10 ruble coins: "+change.number10RublesCoins);
        System.out.println("  5 ruble coins: "+change.number5RublesCoins);
        System.out.println("  2 ruble coins: "+change.number2RublesCoins);
        System.out.println("  1 ruble coins: "+change.number1RublesCoins);
    }
}
