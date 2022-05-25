package lesson1;

public class MyFirstProgramm {

    public static void main(String[] args) {
        /**
         * типы данных
         * -примитивные (8штук)
         * int  32 bit
         * byte 8 bit от 127 до -128 !!!!
         * short 16 bit
         * long 64 bit
         * boolean true/false
         * double 64 bit 17 цифр после запятой
         * float 32 bit 7-8 цифр после запятой ( не популярный)
         * char 16 bit char ch = 'k' в одинарных ковычках
         * ---
         * ссылочные переменные
         * String
         * Integer
         * Math
         * ( их очень много...)
         */

        int a = 12;
        int b = 10;
        int c = 7;

        int perimetr = a + b + c;

        System.out.println(perimetr);


        /**
         * 1 включается компилятор(который переводит код в байт код в папке out)
         * 2 запускаем байт код в jvm
         * 3
         */

        // Напечатать на консоль слово четное или нечетное в зависимости от числа которое ввел пользователь;
        int number = 2;
        int ostatok = number % 2;
        // 1 - не чет
        // 0 - чет
        boolean isChetnoe = ostatok == 0;
        System.out.println(isChetnoe);


    }
}
