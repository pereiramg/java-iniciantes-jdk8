/*
    Esse programa ilustra a diferença entre int e double
*/

public class Example3 {

    public static void main(String[] args) {
        
        // definição de variaveis
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Valor original de var " + var);
        System.out.println("Valor original de x " + x);
        System.out.println();

        var = var / 4;
        x = x / 4;

        System.out.println("var depois da divisao: " + var);
        System.out.println("x depois da diviao: " + x);
        
    }
    
}