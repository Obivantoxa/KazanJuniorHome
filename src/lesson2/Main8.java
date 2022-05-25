package lesson2;

public class Main8 {
    public static void main(String[] args) {
        /**
         * есть массвив символов наполним его сами (10 штук)
         * вывести на консоль только гласные
         */
        char[] chars = {'d','s','a','e','u','r','r','y','g'};

        for (int i = 0; i<chars.length;i++){
            if (chars[i]=='a'||chars[i]=='o'||chars[i]=='y'||chars[i]=='e'||chars[i]=='u'){
                System.out.println(chars[i]);
            }

        }
    }
}
