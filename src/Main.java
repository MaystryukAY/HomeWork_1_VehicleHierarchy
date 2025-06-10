import javax.print.attribute.DateTimeSyntax;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft(555.23, 777, "Дизель", 1270.22);
        System.out.println(aircraft);
        aircraft.describeWheels();
        aircraft.describeScrew();
        aircraft.describeWings();
        aircraft.describeCargo();

        Helicopter helicopter = new Helicopter(322.21, 555, "Дизель", 170.2);
        System.out.println(helicopter);
        helicopter.describeScrew();
        helicopter.describeWheels();
        helicopter.describeCargo();

        Boat boat = new Boat(521, 322, "Бензин", 42);
        System.out.println(boat);
        boat.describeCargo();
        boat.describeScrew();

        Tanker tanker = new Tanker(1000, 5000, "Дизель", 1599);
        System.out.println(tanker);
        tanker.describeCargo();
        tanker.describeScrew();

        Truck truck = new Truck(400, 650, "Дизель", 900);
        System.out.println(truck);
        truck.describeCargo();
        truck.describeWheels();

        Taxi taxi = new Taxi(55, 106, "Пропан", 4);
        System.out.println(taxi);
        taxi.describeWheels();
    }
}
