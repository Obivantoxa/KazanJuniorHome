package lesson6;

public class People {

    String name = new String();
    int age;
    String gender = new String();

    public People() {

    }

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
