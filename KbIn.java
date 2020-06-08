
/*
    Lê um caractere no teclado
*/

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        System.out.print("Pressione uma tecla seguindo de ENTER: ");
        ch = (char) System.in.read(); // obtém um char
        System.out.println("A tecla que você pressionou foi: " + ch);
    }
}