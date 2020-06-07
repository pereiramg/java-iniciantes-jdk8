/*
    Classe generica de veiculos
*/
public class Vehicle {
    int passageiros; // numero de passageiros
    int fuelcap; // capacidade de armazenamento de combustivel em galoes
    int mpg; // consumo de combustivel em milhas por galão
    
    // exibe a autonomia
    int range(){
        return fuelcap * mpg;
    }

    // Calcula o combustivel necessario para cobrir uma determinada distancia
    double fuelneeded(int milhas){
        return (double) milhas / mpg;
    }
}