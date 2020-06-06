/*
    Demostra a coersão
*/

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //converte double para int
        System.out.println("Saida do inteiro de X / Y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Valor de b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Valor de b: " + b);

        b = 88; // ASCII para x
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}