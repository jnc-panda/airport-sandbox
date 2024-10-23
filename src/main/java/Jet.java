public class Jet extends Aeroplane implements Crewable {

    boolean hasCrew;
    int capacity;
    String name;

    public Jet(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("Flying with turbines");
    }

    @Override
    public void crewed() {
        hasCrew = true;

    }
}
