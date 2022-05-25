package lesson1;

import java.util.Scanner;

public class Main2 {

    /**
     * Даны переменные:
     * - деньги которые у нас есть - 1000 рублей
     * - стоимость пиццы - 230 рублей
     * - стоимость жвачки - 26 рублей
     * - стоимость конфеты - 2,5 рубля
     * Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пицц, затем на сдачу купить максимум жвачек,
     * затем на оставшуюся сдачу купить конфет.
     * В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
     * На эти деньги мы можем купить:
     * - 4 пиццы
     * - 3 жвачки
     * - 0 конфет
     * Сдача с магазина: 2 рубля.
     */
    public static void main(String[] args) {

        double money = 0;
        double pricePizza = 230;
        double priceOrbit = 26;
        double priceCandy = 2.5;
        double ostatok = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько у вас денег");
        money = sc.nextDouble();
        int maxPizza = 0;
        int maxOrbit = 0;
        int maxCandy = 0;
        while (money >= pricePizza) {
            money = money - pricePizza;
            maxPizza++;
        }
        System.out.println("Пицц= " + maxPizza);
        while (money >= priceOrbit) {
            money = money - priceOrbit;
            maxOrbit++;
        }
        System.out.println("жвачек= " + maxOrbit);
        while (money >= priceCandy) {
            money = money - priceCandy;
            maxCandy++;
        }
        System.out.println("конфеток= " + maxCandy);
        System.out.println(money);
    }
}
