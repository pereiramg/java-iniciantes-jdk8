/*
    Inicialização dinamica
*/

public class DynInit {
    public static void main(String[] args) {
        // definição das variaveis
        double radius = 4, altura = 5, volume;

        // Inicializa volume dinamicamente
        volume = 3.1416 * radius * radius * altura;
        System.out.println("O volume é: " + volume);
    }
}