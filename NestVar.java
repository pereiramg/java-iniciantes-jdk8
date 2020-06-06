/*
    Este programa tenta declarar uma variavel em 
    um escopo interno com o mesmo nome de uma 
    definida em um escopo externo
*/

public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++){
            System.out.println("Este é o contador: " + count);

            int count; // Invalido
            int teste;
            for (count = 0; count < 2; count++){
                System.out.println("Este programa é um erro!");
            }
        }
        for(count = 0; count < 10; count++){
            int teste;
        }
    }
}