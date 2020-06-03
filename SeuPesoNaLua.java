import java.util.Scanner;

public class SeuPesoNaLua {

    public static void main(String[] args) {
        /*
            Criar um programa para calcular seu peso na Lua
            Na lua o seu peso é 17% com relação a Terra
        */
        // definição de variaveis
        Double peso = 0.0, gravidadeLua = 0.17;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de calculo do seu peso na Lua");
        System.out.print("Informe o seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Seu peso na Lua seria " + (peso * gravidadeLua) + " Kg");

        entrada.close();
    }
    
}