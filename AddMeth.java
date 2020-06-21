public class AddMeth {
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
        range1 = minivan.getFuelcap() * minivan.getMpg();
        range2 = sportcar.getFuelcap() * sportcar.getMpg();

        System.out.print("Minivan pode carregar " + minivan.getPassageiros() + " passageiros. ");
        minivan.range(); // exibe a autonomia da minivan

        System.out.print("SportCar pode carregar " + sportcar.getPassageiros() + " passageiros. ");
        sportcar.range(); // exibe a autonomia do sportcar
    }
}