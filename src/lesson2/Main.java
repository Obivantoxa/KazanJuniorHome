package lesson2;

public class Main {
    public static void main(String[] args) {

        int mark = 3;

        switch (mark) {

            case 5:
                System.out.println("Nice job!");
                break;
            case 4:
                System.out.println("good job!");
                break;
            case 3:
                System.out.println("not bad job!");
                break;
            case 2:
                System.out.println("bad job!");
                break;
            case 1:
                System.out.println("fail !");
                break;
            default:
                System.out.println("This is not a mark!!!");


        }
    }
}
