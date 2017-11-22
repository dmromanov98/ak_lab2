package N3;

public class Product {

    enum types{VAPE,FRUITS,VEGETABLES}

    private int cost; //цена товара
    private String name; //имя товара
    private types type;
    private int col;//количество товара

    public int getCol() {
        return col;
    }

    public void sell(int n){
        col = col - n;
    }

    public types getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public Product(int cost, String name,types type,int col) {
        this.cost = cost;
        this.name = name;
        this.type = type;
        this.col = col;
    }

}
