package lesson11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(5);
        System.out.println(arraylist);
        arraylist.add(1, 33);
        System.out.println(arraylist);
        arraylist.set(1, 44);
        System.out.println(arraylist);
        //   Array[] ar =(Array[]) arraylist.toArray();
        ArrayList<Integer> arraylist2 = new ArrayList<>();
        arraylist2.add(22);
        arraylist2.add(55);
        arraylist.addAll(5,arraylist2);
        System.out.println(arraylist);
        arraylist.removeAll(arraylist2);
        System.out.println(arraylist);
        arraylist.remove(2);
        System.out.println(arraylist);
        arraylist.clear();
        System.out.println(arraylist);
    }
}
