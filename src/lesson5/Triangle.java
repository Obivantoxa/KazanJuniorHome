package lesson5;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double perimetr() {

        if (this.a == 0 || this.b == 0 || this.c == 0) {
            return -1;
            //throw new IllegalArgumentException("One of side equails 0 ");
        }
        return this.a + this.b + this.c;
    }

    public double squareTriangle() {
        if (this.a == 0 || this.b == 0 || this.c == 0) {
            return -1;
        }
        return Math.sqrt((this.perimetr() / 2) *
                (this.perimetr() / 2 - this.a) * (this.perimetr() / 2 - this.b) * (this.perimetr() / 2 - this.c));

    }

    public static boolean pravilnTreug(int a, int b, int c) {
        String flag = "";
        if (a + b > c) {

        } else {
            flag = "c";
        }
        if (b + c > a) {

        } else {
            flag = "a";
        }
        if (a + c > b) {

        } else {
            flag = "b";
        }
        if (flag != "") {
            System.out.println("треугольника такого не существует потому что:");
            System.out.printf("%s > суммы других", flag);
            System.out.println();
        } else
            return true;
        return false;
    }
}

