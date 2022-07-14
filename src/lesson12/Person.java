package lesson12;

public class Person {
    private int age = 30;
    private String name = "Damir";

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age != this.age ) {
            //IllegalArgumentException ex = new IllegalArgumentException();
            // throw ex;
            throw new Exception(" Lol plese try again!!");

        }
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) throws Exception {
        if (!(name.equals(this.name))) {
            throw new Exception("Lol its not my name");

        }
        this.name = name;
    }
}
