public class Chinook extends Helicopter implements Crewable {

    boolean hasCrew;
    int capacity;

    public Chinook(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;

    }

    @Override
    void fly() {
        System.out.println("Flying with dual rotors");
    }

    public void crewed() {
        hasCrew = true;
    }

}
