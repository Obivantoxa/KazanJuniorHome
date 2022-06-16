package lesson5;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String secFigura = ScannerUtils.getFiguraFromUser();
        switch (secFigura) {
            case "1":
            case "Triangle":
                FiguraUtils.triangleFigura();
                break;
            case "2":
                System.out.println("Выбран Sircle");
                System.out.println("Set radius r= ");
                int r = scanner.nextInt();

                break;
            case "3":
                System.out.println("Выбран Paralel");

                break;
            case "4":
                System.out.println("Выбран треугольник");

                break;
            case "5":
                System.out.println("Выбран треугольник");

                break;

            default:
                System.out.println("нет такого числа ");
        }


    }
}
