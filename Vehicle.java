public abstract class Vehicle implements Serviceable {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + " is starting.");
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }
}