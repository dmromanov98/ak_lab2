package N2;

public class Employee {
    private int age; //возраст
    private String name; //имя

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
