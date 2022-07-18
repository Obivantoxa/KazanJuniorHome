package lesson12;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsLesson utils = new StringUtilsLesson();
        String s = "21";

        try {
            utils.div(s,"12");
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("Enter norm numbers");
        }

        System.out.println(Arrays.toString(utils.findWord("Вася сорвал с дерева яблоко. Вкусное яблоко.", "яблоко")));
    }
}
