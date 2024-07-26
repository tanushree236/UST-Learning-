public class InheritanceMain {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.display();
        Car car=new Car(89786687);
        car.showDetails();

        System.out.println("------------------------");
        Vehicle vehicle=new Vehicle();
        vehicle.show();

        vehicle=new Bike();
        vehicle.show();

        vehicle = new Car();
        vehicle.show();
    }
}
