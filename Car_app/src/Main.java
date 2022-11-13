public class Main {
    public static void main(String[] args) throws IllegalAccessException {
//        Car car = new Car(100, 10, Name.Skoda);
//        Car car1 = new Car(200, 5, Name.BMW);
//        Car car2 = new Car(300, 8, Name.Audi);
//        System.out.println(car.getPower());
//        car.setDriving_range(500);
//        car.setPower(20);
//        System.out.println(car.getPower());
//        System.out.println(Car.getCounter());

        try {
            TestCar.testPower();
        }catch (Exception exception){
            System.out.println(exception);
        }
        try{
            TestCar.testDriving_range();
        }catch (Exception exception){
            System.out.println(exception);
        }


    }
}