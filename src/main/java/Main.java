/**
 * ---AIRPORT PROJECT---
 * Airport has planes and helicopters, with attributes hasCrew and destination
 * these vehicles can only take off if they have a crew and good weather
 * for a given day, the weather might be 💩 or the crew could be 🤒 so one or both conditions aren't satisfied
 * if takeoff can occur, vehicles can fly
 * plane and helicopter should show a message saying they are taking off and what their destination is
 */







public class Main {

    public static void main(String[] args) {

        Cessna cessna = new Cessna("Paris", 5);
        Jet Airbus = new Jet(200, "A320", "Turin");
        Sikorsky sikorsky = new Sikorsky("Manchester", 4);
        Chinook chinook = new Chinook("Lossie", 45);


    }
}
