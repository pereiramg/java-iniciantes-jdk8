/*
    Conversão de tipo automatico podem afetar a definição do metodo
    sobrecarregado
*/

public class Overload2 {


    void f(int x){
        System.out.println("Entrada f(int): " + x);
    }

    void f(double x){
        System.out.println("Entrada f(double): " + x);
    }
    
}