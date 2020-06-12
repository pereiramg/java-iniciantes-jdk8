/*
    Letras minisculas
*/
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Essa instrução desativa o 6º bit
            ch = (char) ((int) ch | 32); // agora ch é minusculo
            System.out.print(ch + " ");
        }
    }
}