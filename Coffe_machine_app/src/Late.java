public class Late extends Coffe{

    private String name = "late";
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
        bill = this.ingredients.getEssence() + (2*this.ingredients.getMilk()) + this.ingredients.getSugar();
        return bill;
    }

    //1x esencja, 2x mleko i cukier
    public void prepare(){
        this.ingredients.decrease_essence(1);
        this.ingredients.decrease_milk(2);
        this.ingredients.decrease_sugar(1);
    }

    public Late(Ingredients ingredients){
        this.ingredients = ingredients;
    }
}
