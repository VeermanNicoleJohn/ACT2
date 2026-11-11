public class Motorcycle extends Vehicle {

    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void service() {
        System.out.println(name + ": Lubricate chain and check tire pressure.");
    }
}