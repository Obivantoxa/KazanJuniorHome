package lesson5;

public class Sircle {

    private int r;

    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double perimetrSircle() {
        return 2 * Math.PI * r;
    }

    public double ploshadSircle() {
        return 2 * Math.PI * r * r;
    }
}
