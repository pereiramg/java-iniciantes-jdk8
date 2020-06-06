/*
    Demostra valores booleanos
*/

public class BoolDemo {
    public static void main(String[] args) {
        // definição de variaveis
        boolean b;

        b = false;
        System.out.println("b é " + b);
        b = true;
        System.out.println("b é " + b);

        //controle da instrução if
        if(b) System.out.println("Isto é executado");
        
        b= false;
        if (b) System.out.println("Isto não é executado");

        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 é " + (10 > 9));
    }
    
}