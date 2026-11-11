public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public void service() {
        System.out.println(name + ": Change oil and check brakes.");
    }
}