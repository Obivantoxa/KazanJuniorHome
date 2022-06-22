package lesson6.shop;

public class Tovar {

    private String tovarName = new String();
    private int price;
    private int cod;
    private Otziv[] otziv = new Otziv[1000]; // сущность!!!

    public Tovar(String tovarName, int price, int cod) {
        this.tovarName = tovarName;
        this.price = price;
        this.cod = cod;
    }

    public Tovar() {
    }

    public String getTovarName() {
        return tovarName;
    }

    public void setTovarName(String tovarName) {
        this.tovarName = tovarName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Otziv[] getOtziv() {
        return otziv;
    }

    public void setOtziv(Otziv[] otziv) {
        this.otziv = otziv;
    }

    public void addOtziv(Otziv otziv) {
        int col = 0;

        for (int i = 0; i < this.otziv.length; i++) {
            if (this.otziv[i] == null) {
                this.otziv[i] = otziv;

                col = i;
                break;
            }
        }
        System.out.println("отзыв добавлен" + (this.otziv.length - col - 1));
    }
}
