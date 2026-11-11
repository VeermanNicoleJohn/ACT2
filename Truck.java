public class Truck extends Vehicle {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void service() {
        System.out.println(name + ": Inspect cargo bed and check tire wear.");
    }
}