/*
    Essa classe declara um objeto de tipo veiculo
*/
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // atribui valores a campos de minivan
        minivan.passageiros = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan pode carregar " + minivan.passageiros + 
        " passageiros por uma distancia de " + range + " mpg");
    }
    
}