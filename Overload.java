/*
    Demostra a sobrecarga de métodos
*/
public class Overload {
    void ovlDemo(){
        System.out.println("No parameters");
    }

    // Sobrecarga ovlDemo para um parâmetro inteiro
    void ovlDemo(int a){
        System.out.println("Um parametro " + a);
    }

    // Sobrecarga ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b){
        System.out.println("Dois parametros: " + a + ", " + b);
        return a + b;
    }

    // Sobrecarga ovlDemo para dois parametros double
    double ovlDemo(double a, double b){
        System.out.println("Dois parametros double: " + a + ", " + b);
        return a + b;
    }
}