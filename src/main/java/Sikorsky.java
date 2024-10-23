public class Sikorsky extends Helicopter {

    int capacity;

    public Sikorsky(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
    }

    @Override
    void fly() {
        System.out.println("Flying with single rotor");
    }
}
