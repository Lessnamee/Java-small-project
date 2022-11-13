public class Vehicle {

    protected int driving_range;
    private int power;

    protected int getPower(){
        return this.power;
    }

    protected void setPower(int power){
        this.power = power;
    }

    public Vehicle(int driving_range, int power) {
        this.driving_range = driving_range;
        this.power = power;
    }


}
