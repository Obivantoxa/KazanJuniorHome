package lesson14;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


       // Tovar tovar = new Tovar("qwe",123)
        Tovar t = new Tovar("Pc",70000);
        Tovar t1 = new Tovar("mouse",750);
        Tovar t2 = new Tovar("keyboard",900);
        Tovar t3 = new Tovar("moto",200000);
        Tovar t4 = new Tovar("Vedro",200);


        Otziv otziv = new Otziv(4,"Norm");
        Otziv otziv1 = new Otziv(2,"not bad ");
        Otziv otziv2 = new Otziv(5,"okey");
        Otziv otziv3 = new Otziv(3,"dsadsda");
        Otziv otziv4 = new Otziv(1,"bad");

        t.setOtzivs(otziv);
        t.setOtzivs(otziv1);
        t2.setOtzivs(otziv2);
        t3.setOtzivs(otziv3);
        t4.setOtzivs(otziv4);

        Obzor obzor = new Obzor("dfdf");
        t.setObzors(obzor);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(t);
        tovars.add(t1);
        tovars.add(t2);
        tovars.add(t3);
        tovars.add(t4);

        for (Tovar tovar : tovars){
            System.out.println(tovar);

        }




    }
}
