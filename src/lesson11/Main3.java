package lesson11;

import javax.crypto.spec.PSource;
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Money> monies = new HashSet<>();

        monies.add(new Money(3, 2000, "Gold", 2.2));
        monies.add(new Money(2, 2000, "Gold", 2.0));
        monies.add(new Money(3, 2000, "Gold", 2.2));
        monies.add(new Money(1, 2005, "Gold", 2.2));
        monies.add(new Money(10, 2000, "Gold", 2.2));

        System.out.println(monies);


    }


}
