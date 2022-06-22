package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(12,"British");
        cat.screaming();

        Animal slon1 = new Animal(12,"African");
        Animal slon2 = new Animal(123,"African");

        System.out.println(slon1.equals(slon2));

        System.out.println(slon1.hashCode());
        System.out.println(slon2.hashCode());

        System.out.println(cat.hashCode());

        System.out.println(slon1.getClass());
        System.out.println(slon1.toString());


    }

}
