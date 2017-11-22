package N2;

public class Product {

    enum types{VAPE,FRUITS,VEGETABLES}

    private int cost; //цена товара
    private String name; //имя товара
    private types type;

    public types getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Product(int cost, String name,types type) {
        this.cost = cost;
        this.name = name;
        this.type = type;
    }

}
