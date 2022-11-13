public class Ingredients {

    private int essence = 2;
    private int sugar = 1;
    private int milk = 4;
    private int water = 1;
    private int cookie = 5;

    private int quantity_essence = 100;
    private int quantity_sugar = 100;
    private int quantity_milk = 100;
    private int qunatity_water = 100;
    private int quantity_cookie = 100;

    public void show(){
        System.out.println("Essence balance: " + this.quantity_essence);
        System.out.println("Sugar balance: " + this.quantity_sugar);
        System.out.println("Mleko balance: " + this.quantity_milk);
        System.out.println("Water balance: " + this.qunatity_water);
        System.out.println("Cookie balance: " + this.quantity_cookie);
    }

    public int getEssence() {
        return essence;
    }

    public int getSugar() {
        return sugar;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    public int getCookie() {
        return cookie;
    }

    public int add_essence(){
        quantity_essence = quantity_essence + 100;
        return quantity_essence;
    }
    public int add_sugar(){
        quantity_sugar = quantity_sugar + 100;
        return quantity_sugar;
    }
    public int add_milk(){
        quantity_milk = quantity_milk + 100;
        return quantity_milk;
    }
    public int add_water(){
        qunatity_water = qunatity_water + 100;
        return qunatity_water;
    }
    public int add_cookie(){
        quantity_cookie = quantity_cookie + 100;
        return quantity_cookie;
    }


    public int decrease_essence(int quantity){
        quantity_essence = quantity_essence - quantity;
        return quantity_essence;
    }
    public int decrease_sugar(int quantity){
        quantity_sugar = quantity_sugar - quantity;
        return quantity_sugar;
    }
    public int decrease_milk(int quantity){
        quantity_milk = quantity_milk - quantity;
        return quantity_milk;
    }
    public int decrease_water(int quantity){
        qunatity_water = qunatity_water - quantity;
        return qunatity_water;
    }
    public int decrease_cookie(int quantity){
        quantity_cookie = quantity_cookie - (quantity * 1);
        return quantity_cookie;
    }
}
