public class Espresso extends Coffe{

    private String name = "espresso";
    private double bill;
    private Ingredients ingredients;

    @Override
    public String getName() {
        return this.name;
    }

    public String info(){
        return super.info() + "\n" +
                "Price: " + getBill() + "\n";
    }

    public Espresso(Ingredients ingredients){
        this.ingredients = ingredients;
    }

    @Override
    public double getBill(){
        bill = 2*(this.ingredients.getEssence()) + this.ingredients.getWater();
        return bill;
    }

    //2razy esencja i woda
    public void prepare(){
        this.ingredients.decrease_essence(2);
        this.ingredients.decrease_water(1);
    }



}
