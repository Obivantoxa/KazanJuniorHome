package lesson8;

public class Circle implements Figura, Figura3D {
    @Override
    public void printObiem() {
        System.out.println("obiem");

    }

    @Override
    public void printPerimetr() {
        System.out.println("Perimetr");

    }

    @Override
    public void print3D() {
        System.out.println("3D");
    }
}
