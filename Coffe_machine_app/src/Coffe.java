public abstract class Coffe {
    protected String name = "coffe";

    public String getName() {
        return name;
    }

    public abstract double getBill();
    public abstract void prepare();

    public String info(){
        return "Kind: " + getName();
    };

}
