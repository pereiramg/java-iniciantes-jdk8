/*
    Classe generica de veiculos
    Constrói uma subclasse de Vehicle para caminhoes
*/
public class Vehicle {
    private int passageiros; // numero de passageiros
    private int fuelcap; // capacidade de armazenamento de combustivel em galoes
    private int mpg; // consumo de combustivel em milhas por galão
 
    // Metodos de acesso de variáveis de instancia
    int getPassageiros(){return passageiros;}
    int getFuelcap(){return fuelcap;}
    int getMpg(){return mpg;}
    void setPassageiros(int p){ passageiros = p;}
    void setFuelcap(int f){fuelcap = f;}
    void setMpg(int m){mpg = m;}

    // Esse é um costrutor para Vehicle
    Vehicle(int p, int f, int m){
        passageiros = p;
        fuelcap = f;
        mpg = m;
    }

    // Construtor vazio
    Vehicle(){}

    // exibe a autonomia
    int range(){
        return fuelcap * mpg;
    }

    // Calcula o combustivel necessario para cobrir uma determinada distancia
    double fuelneeded(int milhas){
        return (double) milhas / mpg;
    }
}