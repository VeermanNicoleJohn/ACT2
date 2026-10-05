public class Main {
    public static void main(String[] args) {

       
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2000);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2010);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 1995);

        
        System.out.println("=== Vehicle 1 ===");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println("Brand getter: " + vehicle1.getBrand());
        System.out.println("Model getter: " + vehicle1.getModel());
        System.out.println("Year getter: " + vehicle1.getYear());

       
        System.out.println("\n=== Vehicle 2 ===");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println("Brand getter: " + vehicle2.getBrand());
        System.out.println("Model getter: " + vehicle2.getModel());
        System.out.println("Year getter: " + vehicle2.getYear());

       
        System.out.println("\n=== Vehicle 3 ===");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        System.out.println("Brand getter: " + vehicle3.getBrand());
        System.out.println("Model getter: " + vehicle3.getModel());
        System.out.println("Year getter: " + vehicle3.getYear());

       
        System.out.println("\n=== setYear Tests ===");

        boolean result1 = vehicle1.setYear(2000);
        System.out.println("setYear(2000): " + result1);
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        boolean result2 = vehicle1.setYear(1885);
        System.out.println("\nsetYear(1885): " + result2);
        System.out.println("Stored year: " + vehicle1.getYear());

        boolean result3 = vehicle1.setYear(2027);
        System.out.println("\nsetYear(2027): " + result3);
        System.out.println("Stored year: " + vehicle1.getYear());

       
        System.out.println("\n=== Constructor Validation Tests ===");

        Vehicle invalidVehicle1 = new Vehicle("Test", "Invalid 1885", 1885);
        System.out.println("New vehicle with year 1885:");
        System.out.println("Initial year: " + invalidVehicle1.getYear());

        Vehicle invalidVehicle2 = new Vehicle("Test", "Invalid 2027", 2027);
        System.out.println("New vehicle with year 2027:");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}