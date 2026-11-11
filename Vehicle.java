public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }
        return false;
    }

    // Abstract: every subclass MUST say how it shows its own details
    protected abstract void displaySpecificInfo();

    // Shared by all vehicles; it prints the common part, then
    // hands off to the subclass for the rest
    public void displayInfo() {
        System.out.println(getBrand() + "," + getModel() + "," + getYear());
        displaySpecificInfo();
    }

    public int calculateAge() {
        return 2026 - getYear();
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}