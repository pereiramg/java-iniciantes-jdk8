/*
    Estende Vehicle para criar a especificação Truck
*/
public class Truck extends Vehicle {

    private int cargocap; // capacidade de carga em libras

    // este é um construtor para Truck
    Truck(int p, int f, int m, int c){
        // inicializa membros de Vehicle usando o construtor de vehicle
        super(p, f, m);
        cargocap = c;
    }

    // metodos acessadores para cargocap
    int getCargocap(){return cargocap;}
    void setCargocap(int c){ cargocap = c;}
    
}