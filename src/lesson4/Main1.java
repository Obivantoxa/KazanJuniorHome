package lesson4;


public class Main1 {
    public static void main(String[] args) {
        String str = "example@mail.ru";
        String[] words = str.split("@");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

