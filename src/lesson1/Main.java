package lesson1;

public class Main {

    public static void main(String[] args) {

        /**
         * Напечатать на консоль какой вид 3угальника у пользователя
         * равнобедренный
         * равносторонний
         * разносторонний
         */

        // управляющая конструкция if else

        int a = 7;
        int b = 7;
        int c = 6;

        if (a != b && b != c && c != a) {
            System.out.println("разностороний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("равносторонний треугольник");
        } else
            //if ((a != b && b != c && c == a) || (a == b && b != c && c != a) || (a != b && b == c && c != a)) {
            System.out.println("Равнобедренный");
    }

}


