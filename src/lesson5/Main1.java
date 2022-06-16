package lesson5;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Chose form of figure");
        System.out.println("1 - Triangle");
        System.out.println("2 - Sircle");
        System.out.println("3 - Paralel");
        System.out.println("4 - Konus");
        System.out.println("5 - Oval");
        System.out.println("5 - Тетраэдр");

        Scanner scanner = new Scanner(System.in);

        int secFigura = scanner.nextInt();
        switch (secFigura) {
            case 1:
                System.out.println("Выбран Triangle");
                System.out.println("Set a");
                int a = scanner.nextInt();
                System.out.println("Set b");
                int b = scanner.nextInt();
                System.out.println("Set c");
                int c = scanner.nextInt();
                if (Triangle.pravilnTreug(a, b, c)) {
                    Triangle tr = new Triangle();
                    tr.setA(a);
                    tr.setB(b);
                    tr.setC(c);
                    System.out.println(tr.perimetr());
                    System.out.println(tr.squareTriangle());
                }else{
                    System.out.println("треугольник не правильный ");
                }
                break;
            case 2:
                System.out.println("Выбран Sircle");

                break;
            case 3:
                System.out.println("Выбран Paralel");

                break;
            case 4:
                System.out.println("Выбран треугольник");

                break;
            case 5:
                System.out.println("Выбран треугольник");

                break;

            default:
                System.out.println("нет такого числа ");
        }


    }
}
