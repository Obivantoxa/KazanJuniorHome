package lesson5;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle.setA(13);
        triangle.setB(5);
        triangle.setC(22);
        if (triangle.perimetr() == -1)
            System.out.println("One of side equails 0");
        else
            System.out.println(triangle.perimetr());

        if(triangle.squareTriangle()==-1)
            System.out.println("One of side equails 0");
        else
            System.out.println(triangle.squareTriangle());

        //System.out.println(triangle.pravilnTreug(a,b,c));

    }


}
