package lesson7;

public class Cat extends Animal{

    @Override
    public void screaming() {
        System.out.println("mau-mau");
    }

    public Cat(int age, String poroda) {
        super(age, poroda);
    }
}
