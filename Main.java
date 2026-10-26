public class Main {

    
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());
    }

    public static void main(String[] args) {

        
        System.out.println("=== 1. One Reference, Many Objects ===");
        Vehicle ref = new Car("Porsche", "911", 2001, 2);
        printDetails(ref);
        System.out.println();

        ref = new Motorcycle("Ducati", "Monster", 2019, 937);
        printDetails(ref);
        System.out.println();

        ref = new Truck("Volvo", "FH16", 2020, 18.0);
        printDetails(ref);
        System.out.println();

        
        System.out.println("=== 2. One Method, Different Types ===");
        Car sportsCar = new Car("Bugatti", "Veyron", 500, 2);  
        Motorcycle bike = new Motorcycle("Kawasaki", "Ninja 650", 2023, 649);
        Truck hauler = new Truck("Scania", "R500", 2017, 25.0);

        printDetails(sportsCar);
        System.out.println();
        printDetails(bike);
        System.out.println();
        printDetails(hauler);
        System.out.println();

      
        System.out.println("=== 3. Mixed Array ===");
        Vehicle[] garage = {
            new Car("Porsche", "911", 2001, 2),
            new Car("Bugatti", "Veyron", 500, 2),
            new Car("Ferrari", "250 GTO", 2022, 2),
            new Motorcycle("Triumph", "Bonneville", 1998, 790),
            new Truck("MAN", "TGX", 2024, 20.0)
        };

        for (Vehicle v : garage) {
            printDetails(v);
            System.out.println();
        }

       
        System.out.println("=== 4. setYear Validation ===");
        Vehicle first = garage[0];
        System.out.println(first.setYear(2000));
        System.out.println(first.getYear());
        System.out.println(first.setYear(1885));
        System.out.println(first.getYear());
        System.out.println(first.setYear(2027));
        System.out.println(first.getYear());
    }
}