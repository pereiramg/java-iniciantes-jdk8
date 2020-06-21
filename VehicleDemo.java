/*
    Essa classe declara um objeto de tipo veiculo
*/
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // atribui valores a campos de minivan
        minivan.setPassageiros(7);
        minivan.setFuelcap(16);
        minivan.setMpg(21);

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.getFuelcap() * minivan.getMpg();
        System.out.println("Minivan pode carregar " + minivan.getPassageiros() + 
        " passageiros por uma distancia de " + range + " mpg");
    }
    
}