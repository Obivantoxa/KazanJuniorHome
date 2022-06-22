package lesson7.figura;

public class Kvadrat extends Figura {

    private int a;

    public Kvadrat(int a) {
        this.a = a;
    }

    public Kvadrat() {
    }

    @Override
    public void printObiem() {
        System.out.println("obiem Kvadrat " + (a * 3));
    }

    @Override
    public void printSquare() {
        System.out.println("Square Kvadrat " + (a * a));

    }
}
