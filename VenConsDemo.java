/**
 * 
 */
public class VenConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double galoes;
        int distancia = 252;

        galoes = minivan.fuelneeded(distancia);
        System.out.println("Para percorrer " + distancia + " milhas de minivan é necessario "
        + galoes + " galoes de combustivel");

        galoes = sportcar.fuelneeded(distancia);
        System.out.println("Para percorrer " + distancia + " milhas de Sportcar é necessario "
        + galoes + " galoes de combustivel");

    }
    
}