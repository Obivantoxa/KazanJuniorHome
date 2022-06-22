package lesson7;

public class Animal {


    private int age;
    private String poroda;

    public Animal(int age, String poroda) {
        this.age = age;
        this.poroda = poroda;
    }

    public Animal() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return poroda != null ? poroda.equals(animal.poroda) : animal.poroda == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (poroda != null ? poroda.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    public void screaming(){
        System.out.println("Animal screaaaaming!!!");

    }
}
