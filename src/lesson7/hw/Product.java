package lesson7.hw;

public enum Product {

    TWIX(1,100),COLA(2,75),WATER(3,55),COFFEE(4,80), EMPTY(0,0);

    private int id;
    private int price;

    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public static Product valueOf(int productSelected){
        for(Product product:Product.values()){
            if(productSelected == product.getId()){
                return product;
            }
        }
        return EMPTY;
    }
}
