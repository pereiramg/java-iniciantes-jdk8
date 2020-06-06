/*
    O inesperado em uma promoção
*/

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; //certo, não é necessario a coerção
        // porque o resultado já é elevado a int

        b = 10;
        b = (byte) (b * b); //Aqui é necessaria uma coerção para
        // atribuir um int a um byte

        System.out.println("i e b: " + i + " " + b);   
    }
}