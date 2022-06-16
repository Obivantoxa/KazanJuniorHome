package lesson4;

import java.util.Scanner;

public class MainCalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int num1 = scanner.nextInt();
        System.out.println("Введите 2 число");
        int num2 = scanner.nextInt();
        System.out.println("Введите операцию");
        char oper = CalkUtils.getOperation();
        int res= CalkUtils.calc(num1,num2,oper);
        System.out.println(res);
    }
}
