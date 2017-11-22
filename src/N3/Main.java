package N3;

public class Main {
    public static void main(String[] args) {
        Shop vapeShop = new Shop(10, 5, "VAPE", "VapeNation");

        Employee vadim = new Employee(21, "Vadim");
        Employee kostik = new Employee(19, "Kostik");
        Employee victorPetrovich = new Employee(70, "Victor");
        Employee alyona = new Employee(25, "Alyona");

        vapeShop.addEmployee(vadim);
        vapeShop.addEmployee(kostik);
        vapeShop.addEmployee(victorPetrovich);
        vapeShop.addEmployee(alyona);
        vapeShop.deleteEmployee(victorPetrovich);
        vapeShop.deleteEmployee(vadim);
        vapeShop.addEmployee(alyona);
        vapeShop.addEmployee(victorPetrovich);
        vapeShop.addEmployee(victorPetrovich);

        Product apple = new Product(15,"Apple", Product.types.FRUITS,15);
        Product potato = new Product(8,"Potato", Product.types.VEGETABLES,13);

        Product coil = new Product(220,"Coil", Product.types.VAPE,3);
        Product battery = new Product(1000,"Battery", Product.types.VAPE,15);
        Product mechanicalMod = new Product(3000,"MehMod", Product.types.VAPE,4);
        Product coil1 = new Product(350,"Coil1", Product.types.VAPE,76);
        Product battery1 = new Product(1568,"Battery1", Product.types.VAPE,8);
        Product mechanicalMod1 = new Product(3057,"MehMod1", Product.types.VAPE,92);
        Product coil2 = new Product(2454,"Coil2", Product.types.VAPE,1);
        Product battery2 = new Product(10454,"Battery2", Product.types.VAPE,33);
        Product mechanicalMod2 = new Product(378,"MehMod2", Product.types.VAPE,5);

        vapeShop.addProduct(potato);
        vapeShop.addProduct(apple);
        vapeShop.addProduct(mechanicalMod);
        vapeShop.addProduct(mechanicalMod1);
        vapeShop.addProduct(mechanicalMod2);
        vapeShop.addProduct(coil);
        vapeShop.addProduct(coil1);
        vapeShop.addProduct(coil2);
        vapeShop.addProduct(battery);
        vapeShop.addProduct(battery1);
        vapeShop.addProduct(battery2);
        vapeShop.addProduct(battery2);

        vapeShop.sell(coil,3,vadim);
        vapeShop.sell(coil2,3,alyona);
        vapeShop.sell(coil2,2,alyona);
        vapeShop.sell(battery2,10,victorPetrovich);

        System.out.println();
        System.out.println("OUT : ");
        System.out.println("Shop : "+vapeShop.getName()+" \nEmployeers : ");
        for(int i = 0;i<vapeShop.getEmployees().size();i++)
            System.out.println(vapeShop.getEmployees().get(i).getName());
        System.out.println("Products : ");
        for(int i = 0;i<vapeShop.getProducts().size();i++)
            System.out.println(vapeShop.getProducts().get(i).getName()+
                    " Price : "+ vapeShop.getProducts().get(i).getCost());
        System.out.println("Total amount of goods : "+ vapeShop.getCostOfAllProducts());

    }
}