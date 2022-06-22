package lesson7.figura;

public class Circle extends Figura {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public Circle() {
    }

    @Override
    public void printObiem() {
        System.out.println("obiem circle " + (2 * Math.PI *r));
    }

    @Override
    public void printSquare() {
        System.out.println("Square circle " + (Math.PI *(r * r)));

    }
}
