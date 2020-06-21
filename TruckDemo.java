// constrói alguns caminhões
public class TruckDemo {
    public static void main(String[] args) {
        
        // constrói alguns caminhões
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi pode carregar " + semi.getCargocap() + 
        " libras.");
        System.out.println("Para ir " + dist + " milhas no semi, é preciso " +
        gallons + " Gallons de combustivel.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup pode carregar " + pickup.getCargocap() + 
        " libras.");
        System.out.println("Para ir " + dist + " milhas na Pickup, é preciso " +
        gallons + " Gallons de combustivel.\n");

    }
}