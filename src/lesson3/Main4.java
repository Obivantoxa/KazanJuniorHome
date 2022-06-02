package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String s = "123";
        s.length();
        int i = s.length();
        System.out.println(i);
        char ch = s.charAt(2);
        System.out.println(ch);
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '2') {
                System.out.println("Двойкка");
            } else {
                System.out.println(s.charAt(j));
            }
        }
    }
}
