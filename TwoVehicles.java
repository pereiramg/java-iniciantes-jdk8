public class TwoVehicles {
    public static void main(String[] args) {
        
        // Lembre-se de que minivan e sportcar referencial objetos separados
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        // atribui valores a campos de minivan
        minivan.passageiros = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a campos a sportcar
        sportcar.passageiros = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Minivan pode carregar " + minivan.passageiros + 
        " passageiros por uma distancia de " + range1 + " mpg");

        System.out.println("SportCar pode carregar " + sportcar.passageiros + 
        " passageiros por uma distancia de " + range2 + " mpg");
    }
}