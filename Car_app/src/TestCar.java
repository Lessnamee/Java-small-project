public class TestCar {
    public static void testPower() throws IllegalAccessException {
        int entry_power = 8;
        Car car = new Car(300, 2, Name.Audi);
        if(car.getPower() != entry_power){
            throw new IllegalAccessException("Entry power wrong");
        }
        int new_power = 13;
        car.setPower(24);
        if(car.getPower() != new_power){
            throw new IllegalAccessException("New power wrong");
        }

    }

    public static void testDriving_range() throws IllegalAccessException {
        int entry_driving_range = 200;
        Car car = new Car(entry_driving_range, 30, Name.Audi);
        if(car.getDriving_range() != entry_driving_range){
            throw new IllegalAccessException("Entry driving range wrong");
        }
        int new_driving_range = 500;
        car.setDriving_range(220);
        if(car.getDriving_range() != new_driving_range){
            throw new IllegalAccessException("New driving range wrong");
        }
    }
}
