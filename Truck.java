public class Truck extends Vehicle {
    private double loadCapacityTons;

    public Truck(String brand, String model, int year, double loadCapacityTons) {
        super(brand, model, year);
        this.loadCapacityTons = loadCapacityTons;
    }

    @Override
    protected void displaySpecificInfo() {
        System.out.println("Load Capacity: " + loadCapacityTons + " tons");
    }
}