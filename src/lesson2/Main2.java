package lesson2;

public class Main2 {
    public static void main(String[] args) {

        /**
         * Print console all number from 30 to 60;
         */

//        for (int i=30;i<=60;i++){
//            System.out.println(i);
//
//        }
        /**
         * Print console  numbers from 20 to 70 которые делятся на 5 и на 6 без остатка;
         */

        for (int j = 20; j <= 70; j++) {
            if (j % 5 == 0 && j % 6 == 0) {
                System.out.println(j);

            }

        }
    }
}
