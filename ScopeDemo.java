/*
    Demostra o escopo de bloco
*/

public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        x = 10;

        if (x == 10){ // novo escopo
            int y = 20; // conhecido apenas nesse bloco
            // tanto x como y são conhecidos aqui
            System.out.println("X and Y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; Erro! Y não é conhecida aqui <------------

        // x ainda é conhecida aqui
        System.out.println("x é " + x);
    }
}