/*
    Demostra a instrução IF
*/

public class IfDemo {

    public static void main(String[] args) {
        // Definição
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("a e menor que b");
        if (a == b) System.out.println("Nada a exibir");
        System.out.println();
        c = a -b;
        System.out.println("c contem -1");
        if (c >= 0 ) System.out.println("c nao e negativo");
        if (c < 0) System.out.println("c e negativo");
        System.out.println();
        c = b - a;
        System.out.println("c contem 1");
        if (c >= 0) System.out.println("c nao e negativo");
        if (c < 0) System.out.println("c e negativo");
    }

}