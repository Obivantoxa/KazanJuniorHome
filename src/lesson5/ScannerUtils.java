package lesson5;

import java.util.Scanner;

public class ScannerUtils {
    public static String getFiguraFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose form of figure");
        System.out.println("1 - Triangle");
        System.out.println("2 - Sircle");
        System.out.println("3 - Paralel");
        System.out.println("4 - Konus");
        System.out.println("5 - Oval");
        System.out.println("6 - Тетраэдр");

        String inputFigura = scanner.nextLine();
        if (!inputFigura.equals("1") &&
                !inputFigura.equals("2") &&
                !inputFigura.equals("3") &&
                !inputFigura.equals("4") &&
                !inputFigura.equals("5") &&
                !inputFigura.equals("6") &&
                !inputFigura.equalsIgnoreCase("Triangle") &&
                !inputFigura.equalsIgnoreCase("Sircle") &&
                !inputFigura.equalsIgnoreCase("Paralel") &&
                !inputFigura.equalsIgnoreCase("Konus") &&
                !inputFigura.equalsIgnoreCase("Oval") &&
                !inputFigura.equalsIgnoreCase("Тетраэдр")) {
            return getFiguraFromUser(); // рекурсивный вызов метода
        }

        return inputFigura;
    }
}
