package lesson5;

import java.util.Scanner;

public class FiguraUtils {
    public static void triangleFigura() {
        Scanner scanner = new Scanner(System.in);

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
            System.out.println("Perimetr = " + tr.perimetr());
            System.out.println("Square = " + tr.squareTriangle());
        } else {
            System.out.println("Повторите ввод сторон треугольника");
            triangleFigura();

            //Triangle.pravilnTreug(a, b, c);
        }
    }


}
