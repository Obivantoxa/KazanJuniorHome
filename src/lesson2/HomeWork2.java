package lesson2;

public class HomeWork2 {

    public static void main(String[] args) {
        /*
        Домашнее задание на третье занятие:
С помощью цикла For, напечатать на консоль:
1) Только четные от -100 до -50
2) Все числа в обратном порядке от 10 до 30
3) Кол-во четных чисел в диапазоне от 30 до 61
4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
         */
        System.out.println("1------------");
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            // System.out.println(i);
        }
        System.out.println();
        System.out.println("2------------");
        for (int i = 30; i >= 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("3------------");
        int count = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("4------------");
        int let = 0;
        //4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
        for (double i = 9500.0; i <= 200000.0; i += 9500) {
            let++;


        }
        System.out.println(let);
        System.out.println("5------------");
        //5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
        for (int i = 20; i <= 60; i++) {
            if ((i >= 30) && (i <= 40)) {
                System.out.print("- ");
            } else {
                System.out.print(i + " ");

            }
        }
        System.out.println();
        System.out.println("6------------");
/*
Всем привет 👋 вторая часть дз с массивами.
В массив от 0 до 99 заполнить случайными числами от 0 до 1000.
Вывести значения в порядке возрастания и посчитать сколько четных и нечетных.
 */
        int numCount = 0;
        int numChet = 0;
        int numNeChet = 0;
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() * 1000);
            numCount++;
            if (num[i] % 2 == 0) {
                numChet++;
            } else {
                numNeChet++;
            }
        }
        System.out.println(numCount +" сколько всего чисел в массиве ");
        System.out.println(numChet+" сколько всего четных");
        System.out.println(numNeChet + " сколько всего нечетных" );
        sort(num);
        System.out.println("сортируем по возрастанию");
        for (int j : num) {
            System.out.print(j + " ");
        }
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
