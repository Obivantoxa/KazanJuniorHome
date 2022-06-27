package lesson7.hw;

public enum Coin {

    OneRubles(1), TwoRubles(2), FiveRuble(5), TenRubles(10);

    private int value;

    private Coin(int value){
        this.value=value;

    }
    public int getValue(){
        return this.value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for(int i= 0; i<numberCoinsInText.length; i++) {
            result[i] = Integer.parseInt(numberCoinsInText[i]);
        }
        return result;
    }
}
