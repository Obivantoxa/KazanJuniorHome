package lesson11;

import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("DFasd");
        linkedList.add("DFadfgg");
        linkedList.add("DFaaa");
        linkedList.add("DFsda");
        linkedList.add("DFssa");
        System.out.println(linkedList);

        linkedList.addFirst("Hello world");
        System.out.println(linkedList);

    }
}
