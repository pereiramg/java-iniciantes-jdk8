public class RetMath {
    public static void main(String[] args) {
        // Lembre-se de que minivan e sportcar referencial objetos separados
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        // atribui valores a campos de minivan
        minivan.setPassageiros(7);
        minivan.setFuelcap(16);
        minivan.setMpg(21);

        // atribui valores a campos a sportcar
        sportcar.setPassageiros(2);
        sportcar.setFuelcap(14);
        sportcar.setMpg(12);

        // calcula a autonomia presumindo um tanque cheio de gasolina
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Minivan pode carregar " + minivan.getPassageiros() + 
        " passageiros. A autonomia é " + range1 + " milhas");
        
        System.out.println("SportCar pode carregar " + sportcar.getPassageiros() + 
        " passageiros. A autonomia é " + range2 + " milhas");
    }

}