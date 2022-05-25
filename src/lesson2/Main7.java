package lesson2;

public class Main7 {

    public static void main(String[] args) {
        /**
         * Массив чисел
         * задача напечатать то что в массиве через ячейку в обратном порядке
         *
         */

        int[] num = {0,1,2,3,4,5,6,7,8,9};

//        System.out.println(num[9]);
//        System.out.println(num[7]);
//        System.out.println(num[5]);
//        System.out.println(num[3]);
//        System.out.println(num[1]);

        for (int i = num.length-1 ; i>=1;i-=2){
            System.out.println(num[i]);

        }
    }
}
