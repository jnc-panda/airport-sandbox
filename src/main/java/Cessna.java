public class Cessna extends Aeroplane {

    int capacity;

   public Cessna(String destination, int capacity) {
       this.destination = destination;
       this.capacity = capacity;
   }

    @Override
    void fly() {
        System.out.println("Flying with propeller");

    }

    @Override
    public void addRunway(int bearing) {
        super.addRunway(bearing);
    }
}
