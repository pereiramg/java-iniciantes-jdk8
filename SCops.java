/*
    Demostra os operadores de curto-circuito
*/

public class SCops {
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) System.out.println(d + " é um fatorial de " + n);

        d = 0; //configura d com zero
        // Já que d é igual a zero, o segundo operador não é avaliado
        // O operador de curto-circuito impede uma divisão por zero
        if (d != 0 && (n % d) == 0) System.out.println(d + " é um fatorial de " + n);

        // Agora as duas expressões são avaliadas, permitindo que ocorra uma divisão por zero
        // Isso causará um erro de divisão por zero
        if (d != 0 & (n % d) == 0) System.out.println(d + " é um fatorial de " + n);
    }
    
}