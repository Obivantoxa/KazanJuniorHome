package lesson2;

public class Main5 {
    public static void main(String[] args) {

        int[] numbers = new int[6];

        /**
         * наполнить массив четными от 30 и далее до конц массива
         */
//        numbers[0] = 30;
//        numbers[1] = 32;
//        numbers[2] = 34;
//        numbers[3] = 36;
//        numbers[4] = 38;
//        numbers[5] = 40;

        int value = 30;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value;
            value += 2;
        }
    }
}
