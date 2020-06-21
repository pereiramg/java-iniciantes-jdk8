public class CompFuel {
    public static void main(String[] args) {
        // Lembre-se de que minivan e sportcar referencial objetos separados
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double galoes;
        int distancia = 252;

        // atribui valores a campos de minivan
        minivan.setPassageiros(7);
        minivan.setFuelcap(16);
        minivan.setMpg(21);
        
        // atribui valores a campos a sportcar
        sportcar.setPassageiros(2);
        sportcar.setFuelcap(14);
        sportcar.setMpg(12);

        galoes = minivan.fuelneeded(distancia);
                System.out.println(
                "Para percorrer " + distancia + 
                " milhas de minivan é necessario " + galoes + 
                " galoes de gasolina");

                galoes = sportcar.fuelneeded(distancia);
                System.out.println(
                "Para percorrer " + distancia + 
                " milhas de SportCar é necessario " + galoes + 
                " galoes de gasolina");
    }
}