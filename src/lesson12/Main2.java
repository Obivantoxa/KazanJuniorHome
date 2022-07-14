package lesson12;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        boolean b = true;
        boolean b1 = true;
        Person p = new Person();

        while (b == true && b1 == true) {
            Scanner dc = new Scanner(System.in);
            System.out.println("enter name");
            String name = dc.nextLine();

            try {
                p.setName(name);
                b = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("miss name");

            }
            System.out.println("enter age");
            int age = Integer.parseInt(dc.nextLine());
            try {
                p.setAge(age);
                b1 = false;
            } catch (Exception e) {
                e.printStackTrace();
                //break;
            }

            System.out.println("hi my name damir");
        }
        System.out.println("nice");
    }
}
