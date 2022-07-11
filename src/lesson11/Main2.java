package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long alTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arr.add(0, "qwe" + i);
        }
        long alTimeEnd = System.currentTimeMillis();
        System.out.println(alTimeEnd - alTimeStart);


        long lTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "qwe" + i);
        }
        long lTimeEnd = System.currentTimeMillis();
        System.out.println(lTimeEnd - lTimeStart);

        long getTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arr.get(i);
        }
        long getTimeEnd = System.currentTimeMillis();
        System.out.println(getTimeEnd - getTimeStart);

        long lgetTimeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        long lgetTimeEnd = System.currentTimeMillis();
        System.out.println(lgetTimeEnd - lgetTimeStart);



    }
}
