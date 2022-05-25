package lesson2;

public class Main3 {
    /**
     * Print on четные в обратном подяке от 100 до 150
     */

    public static void main(String[] args) {


        for (int i = 150; i > 100; i--) {
            if (i % 2 == 0)
                System.out.println(i);

        }
    }
}
