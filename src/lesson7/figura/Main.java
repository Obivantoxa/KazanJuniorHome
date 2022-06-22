package lesson7.figura;

public class Main {
    public static void main(String[] args) {

        Kvadrat kvadrat1 = new Kvadrat(4);
        Kvadrat kvadrat2 = new Kvadrat(6);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        Figura[] figurs = new Figura[4];

        figurs[0] = kvadrat1;
        figurs[1] = kvadrat2;
        figurs[2] = circle1;
        figurs[3] = circle2;

        for (Figura p : figurs) {
            p.printObiem();
            p.printSquare();
        }


    }
}
