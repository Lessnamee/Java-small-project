
enum Name{
    BMW, Audi, Skoda;
};

public class Car extends Vehicle{
    private Name name;
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public void setDriving_range(int driving_range){
        this.driving_range = driving_range;
    }

    public int getDriving_range(){
        return this.driving_range;
    }

    public void setPower(int power){
        super.setPower(power);
    }

    public static void add_counter(){
        Car.counter = Car.counter + 1;
    }

    public Car(int driving_range, int power, Name name) {
        super(driving_range, power);
        Car.add_counter();
        this.name = name;


    }


}
