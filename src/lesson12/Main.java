package lesson12;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        try {
            person.setAge(13);
            person.setName("");
            System.out.println("Try install");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("name");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("age!");
        }
        System.out.println("Done");

    }
}
