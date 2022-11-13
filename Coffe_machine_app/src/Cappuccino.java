public class Cappuccino extends Coffe{

    private String name = "cappuccino";
    private Ingredients ingredients;
    private double bill;

    @Override
    public String getName() {
        return name;
    }

    public String info(){
        return super.info() + "\n" +
                "Price: " + getBill() + "\n";
    }


    @Override
    public double getBill() {
        bill = this.ingredients.getEssence() + this.ingredients.getMilk() +
                (2*this.ingredients.getSugar()) + this.ingredients.getCookie();
        return bill;
    }

    //1x esencja, 1x mleko, 2x cukier i ciastko
    public void prepare(){
        this.ingredients.decrease_essence(1);
        this.ingredients.decrease_milk(2);
        this.ingredients.decrease_sugar(2);
        this.ingredients.decrease_cookie(1);
    }

    public Cappuccino(Ingredients ingredients){
        this.ingredients = ingredients;
    }
}
