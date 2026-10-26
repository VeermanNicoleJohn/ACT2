public class Motorcycle extends Vehicle {
    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineCC + " cc");
    }
}