package N2;

public class Shop {
    private int quantityOfGoods; // количество мест для товара
    private int placesForEmloyees; // количество мест для работников
    private String type; //тип магазина
    private String name; //название магазина
    private Employee[] employees;
    private Product[] products;

    public int getCostOfAllProducts() {

        int costOfAllProducts = 0;
        for(int i = 0;i<products.length;i++)
            if(products[i] != null)
                costOfAllProducts += products[i].getCost();

        return costOfAllProducts;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Product[] getProducts() {
        return products;
    }

    public Shop(int quantityOfGoods, int placesForEmloyees, String type, String name) {
        this.quantityOfGoods = quantityOfGoods;
        this.placesForEmloyees = placesForEmloyees;
        this.type = type;
        this.name = name;
        employees = new Employee[this.placesForEmloyees];
        products = new Product[this.quantityOfGoods];
    }

    //добавление работников
    public void addEmployee(Employee employee){
        boolean added = false;
        int exist = 0;

        for (int i = 0; i < employees.length; i++){
            if (employees[i] == employee) {
                exist++;
                break;
            }
        }
        if (exist == 0)
            for(int i = 0; i < employees.length;i++){
                if(employees[i] == null){
                    employees[i] = employee;
                    added = true;
                    break;
                }
            }

        if(added){
            System.out.println(employee.getName()+" will work in "+ name);
        }else{
            if(exist == 0)
                System.out.println("There are no places for "+employee.getName());
            else
                System.out.println(employee.getName()+" work here already");
        }

    }

    public void addProduct(Product product){

        int exist = 0;
        boolean added = false;
        boolean equalstypes = false;

        if(product.getType().toString().equals(this.type)) {
            equalstypes = true;

            for (int i = 0; i < products.length; i++){
                if (products[i] == product) {
                    exist++;
                    break;
                }
            }

            if(exist ==0)
                for (int i = 0; i < products.length; i++) {
                    if (products[i] == null) {
                        products[i] = product;
                        added = true;
                        break;
                    }
                }
        }

        if(added && equalstypes){
            System.out.println(product.getName()+" will sell in "+ name);
        }else{
            if(equalstypes){
                if (exist == 0)
                    System.out.println("There are no places for " + product.getName());
                else
                    System.out.println(product.getName()+" already in shop");
            }else {
                System.out.println(product.getName()+" product is not for this store!");
            }
        }
    }

    //метод увольнения сотрудников
    public void deleteEmployee(Employee employee){
        boolean deleted = false;

        for(int i = 0; i < employees.length;i++){
            if(employees[i] == employee){
                employees[i] = null;
                deleted = true;
                break;
            }
        }

        if(deleted){
            System.out.println(employee.getName()+" willn't work in "+ name);
        }else{
            System.out.println(employee.getName()+ " doesn't work here");
        }

    }
}
