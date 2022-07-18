package lesson11;

import java.util.*;

public class CollectionsUtils implements ICollectionUtils {

/*

  1 2 3 4  коллекция2  2 3 4 5 6

 1)  1 2 3 4 2 3 4 5 6
 2) 2 3 4 2 3 4
 3) 1 2 3 4 5 6
 4) 2 3 4
 5) 1 5 6


 */

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);
        return union;

    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> intersection = new LinkedList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;

    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> ret = new HashSet<>();
        ret.addAll(a);
        ret.addAll(b);
        return ret;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersectionWithoutDuplicate.add(num);

            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersectionWithoutDuplicate.add(num);
            }
        }

        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> difference = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);
            }
        }
        return difference;
    }
}
