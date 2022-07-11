package lesson11;

import java.util.ArrayList;
import java.util.Collection;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        CollectionsUtils union = new CollectionsUtils();
        Collection<Integer> intC = union.union(arrayList1,arrayList2);




    }
}
