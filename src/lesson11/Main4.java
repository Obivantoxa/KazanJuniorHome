package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        HashSet<Integer> b = new HashSet<>();
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        CollectionsUtils util = new CollectionsUtils();
        System.out.println(util.union(a,b));

        CollectionsUtils util2 = new CollectionsUtils();
        System.out.println(util2.intersection(a,b));

        CollectionsUtils util3 = new CollectionsUtils();
        System.out.println(util3.unionWithoutDuplicate(a,b));

        CollectionsUtils util4 = new CollectionsUtils();
        System.out.println(util4.intersectionWithoutDuplicate(a,b));

        CollectionsUtils util5 = new CollectionsUtils();
        System.out.println(util5.difference(a,b));

    }
}
