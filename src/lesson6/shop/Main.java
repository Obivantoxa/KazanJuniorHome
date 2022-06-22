package lesson6.shop;

public class Main {

    public static void main(String[] args) {

        Tovar tovar1 = new Tovar("telefon",10000,123);
        Tovar tovar2 = new Tovar("pilesos",100000,12);
        Tovar tovar3 = new Tovar("telek",107000,1);
        Tovar tovar4 = new Tovar("skaner",100050,23);

        Otziv otziv1 = new Otziv("user1 ",5.0,"норм товар рекомендую"," топ топ топ ");
        Otziv otziv2 = new Otziv("user2 ",4.2," товар как товар ","топ");


        tovar1.addOtziv(otziv1);

    }
}
