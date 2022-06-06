package lesson4;

public class Main {

    public static void main(String[] args) {

        String[][] mas = {{"Turkey", "60", "5 stars", "Train", "Food"},
                {"Italy", "67", "5 stars", "Plane", "Water"},
                {"Italy", "44", "5 stars", "Train", "Food"},
                {"Italy", "70", "3 stars", "Plane", "Water"},
                {"Moscow", "80", "3 stars", "Plane", "Food"},
                {"Germany", "20", "4 stars", "Train", "Water"},
                {"USA", "630", "7 stars", "Plane", "Food"}};

        Toure.getCountry(mas, "Turkey");

        Toure t = new Toure();
        t.delCountry(mas, "Turkey");

        int f = Integer.parseInt("11");
        System.out.println();
        Toure.getCountry(mas,"Italy",68);
        System.out.println();

        Toure.corting(mas,40,80);

        /*
        1)проверить почту на правильность
        1.1 одна собачка
        1.2 должна быть 1 точка
        1.3 должна быть
        1.4 проверка точки ( не в начале не в конце слова\собачки 2 подряд)
        1.5
        2 проверить пароль
        2.1 не должен соответствовать почте
        2.2 пароль должен иметь как минимум 8 символов
        2.3.  одна заглавная . один символ на английском
        не должно быть 3 символа подряд
         */



    }
}
