package lesson4;

import java.util.Scanner;

public class CalkUtils {
    static Scanner sc = new Scanner(System.in);
    public static char getOperation() {
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            sc.next();
            operation = getOperation(); // рекурсивно вызываю метод вроде так
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия на операцию
        }
        return result;
    }
}
