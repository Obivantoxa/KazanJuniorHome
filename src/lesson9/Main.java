package lesson9;

public class Main {
    public static void main(String[] args) {
// 2 дз
        Book b1 = new Book("potter", 2000, "piter", 302, "jj");
        Book b2 = new Book("potter2", 2001, "piter", 332, "jj");
        Book b3 = new Book("potter3", 2002, "piter", 655, "jj");
        Book b4 = new Book("potter4", 2005, "piter", 345, "jj");
        Book b5 = new Book("potter5", 2006, "piter", 553, "jj");
        Book b6 = new Book("potter6", 2008, "piter", 323, "jj");
        Book b7 = new Book("mir", 2002, "moskva", 654, "jj");
        Book b8 = new Book("voina", 2003, "moskva", 222, "jj");
        Journal j1 = new Journal("piter", 2021, "kazan", 323, 3);
        Journal j2 = new Journal("piter", 2021, "kazan", 323, 2);
        Journal j3 = new Journal("piter", 2020, "kazan", 313, 2);
        ;
        Journal j4 = new Journal("pravda", 2019, "tatarstan", 333, 2);
        Journal j5 = new Journal("pravda", 2018, "tatarstan", 353, 24);
        Journal j6 = new Journal("moskva", 2020, "murzilka", 337, 2);
        Journal j7 = new Journal("moskva", 2021, "murzilka", 373, 1);

        PrintPub massivPub[] = new PrintPub[]{b1, b2, b3, b4, b5, b6, b7, b8, j1, j2, j3, j4, j5, j6, j7};

        Book.sortBookDesc(massivPub);
        for (PrintPub x : massivPub){
            System.out.println(x);
        }

    }

    public static int sort(int[] array) {
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
        return 0;
    }
}
