public class Jet extends Aeroplane implements Crewable {

    boolean hasCrew;
    int capacity;
    int passengersOnboard = 0;
    String name;

    public Jet(int capacity, String name, String destination) {
        this.capacity = capacity;
        this.name = name;
        this.destination = destination;
    }

    @Override
    void fly() {
        System.out.println("Flying with turbines");
    }

    @Override
    public void crewed() {
        hasCrew = true;
    }

    @Override
    public void addRunway(int bearing) {
        super.addRunway(bearing);
    }

    public void addPassengers(int passengers) {
        passengersOnboard += passengers;
    }
}
