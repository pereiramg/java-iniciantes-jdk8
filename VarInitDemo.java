/*
    Demostra o tempo de vida de uma variavel
*/

public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y = -1; // y será inicializada sempre que entrarmos no bloco
            System.out.println("y agora é " + y);
            y = 100;
            System.out.println("y agora é: " + y);
        }
    }
}