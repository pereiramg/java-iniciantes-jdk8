public class CompFuel {
    public static void main(String[] args) {
        // Lembre-se de que minivan e sportcar referencial objetos separados
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double galoes;
        int distancia = 252;

        // atribui valores a campos de minivan
        minivan.passageiros = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // atribui valores a campos a sportcar
        sportcar.passageiros = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

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