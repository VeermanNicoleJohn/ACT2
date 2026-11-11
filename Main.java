public class Main {
    public static void main(String[] args) {
        Serviceable[] items = {
            new Car("Toyota Vios"),
            new Motorcycle("Honda Click"),
            new Truck("Isuzu Elf"),
            new Printer()
        };

        for (Serviceable item : items) {
            item.service();
        }
    }
}