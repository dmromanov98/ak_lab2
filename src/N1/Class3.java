package N1;

public class Class3 implements Class2 {

    public String par1;
    private int par2;
    private short par3;

    //недостающее поле
    private Class4[] class4;

    @Override
    public void Operation1() {

    }

    @Override
    public void Operation2() {

    }

    @Override
    public String Operation3() {
        return null;
    }

    @Override
    public int Operation4() {
        return 0;
    }

    public Class3(Class4[] class4){
        this.class4 = class4;
    }

}
