package lesson14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortTovars  {

    public static TreeSet<Tovar> SortTovarNameFromTo(Set<Tovar> tovars){
        TreeSet<Tovar> retTov = new TreeSet<Tovar>((o1, o2)->{
            if (o1.getPrice() != o2.getPrice()) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
            if (o1.midRate()!=o2.midRate()){
                return Double.compare(o1.midRate(),o2.midRate());
            }
            if (o1.getOtzivs().size()!=o2.getOtzivs().size()){
                return Integer.compare(o1.getOtzivs().size(),o2.getOtzivs().size());
            }
            if (o1.getObzors().size()!=o2.getObzors().size()){
                return Integer.compare(o1.getObzors().size(),o2.getObzors().size());
            }
            if (!o1.getName().equals(o2.getName())){
                return o1.getName().compareTo(o2.getName());
            }
            return 0;
        });


        return retTov;
    }

}
