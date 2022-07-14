package lesson12;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsLesson utils = new StringUtilsLesson();
        String s = "21";

        try {
            utils.div(s,"0");
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("Enter norm numbers");
        }
    }
}
