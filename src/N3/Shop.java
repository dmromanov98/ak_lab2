package N3;

import java.util.ArrayList;

public class Shop {
    private int quantityOfGoods; // количество мест для товара
    private int placesForEmloyees; // количество мест для работников
    private String type; //тип магазина
    private String name; //название магазина
    private ArrayList<Employee> employees;
    private ArrayList<Product> products;

    public int getCostOfAllProducts() {

        int costOfAllProducts = 0;

        for (int i = 0; i < products.size(); i++)
            costOfAllProducts += products.get(i).getCost();

        return costOfAllProducts;
    }

    public void sell(Product product,int n,Employee employee){
        int i = products.indexOf(product);

        if(i>=0){
            products.get(i).sell(n);
            if (products.get(i).getCol()<=0){
                System.out.println("Employee : "+ employee.getName()+
                    " selled product : "+ products.get(i).getName()+
                    " quantity : " + (n+products.get(i).getCol()) + " cost : "+ products.get(i).getCost() + " Sum : "+
                        (products.get(i).getCol()+n)*products.get(i).getCost());
                products.remove(i);
            }else{
                System.out.println("Employee : "+ employee.getName()+
                        " selled product : "+ products.get(i).getName()+
                        " quantity : " + n + " cost : "+ products.get(i).getCost() +" Sum : "+
                        n*products.get(i).getCost());
            }
        }else{
            System.out.println(product.getName()+" is no product in the store");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Shop(int quantityOfGoods, int placesForEmloyees, String type, String name) {
        this.quantityOfGoods = quantityOfGoods;
        this.placesForEmloyees = placesForEmloyees;
        this.type = type;
        this.name = name;
        employees = new ArrayList<>();
        products = new ArrayList<>();
    }

    //добавление работников
    public void addEmployee(Employee employee) {
        boolean added = false;
        int exist = 0;

        if (employees.indexOf(employee) >= 0)
            exist++;

        if (exist == 0) {
            employees.add(employee);
            added = true;
        }


        if (added) {
            System.out.println(employee.getName() + " will work in " + name);
        } else {
            if (exist == 0)
                System.out.println("There are no places for " + employee.getName());
            else
                System.out.println(employee.getName() + " work here already");
        }

    }

    public void addProduct(Product product) {

        int exist = 0;
        boolean added = false;
        boolean equalstypes = false;

        if (product.getType().toString().equals(this.type)) {
            equalstypes = true;

            if (products.indexOf(product) >= 0)
                exist++;

            if (exist == 0) {
                products.add(product);
                added = true;
            }

        }

        if (added && equalstypes) {
            System.out.println(product.getName() + " will sell in " + name + " cost : "+product.getCost()+" col : "+product.getCol());
        } else {
            if (equalstypes) {
                if (exist == 0)
                    System.out.println("There are no places for " + product.getName());
                else
                    System.out.println(product.getName() + " already in shop");
            } else {
                System.out.println(product.getName() + " product is not for this store!");
            }
        }
    }

    //метод увольнения сотрудников
    public void deleteEmployee(Employee employee) {
        boolean deleted = false;

        int i = employees.indexOf(employee);
        if(i>=0) {
            employees.remove(i);
            deleted = true;
        }


        if (deleted) {
            System.out.println(employee.getName() + " willn't work in " + name);
        } else {
            System.out.println(employee.getName() + " doesn't work here");
        }

    }
}
