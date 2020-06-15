/*
    Demostra a Classe Queue
*/
public class QDemo2 {
    public static void main(String[] args) {
        // constrói uma fila vazia para 10 elementos
        Queue q1 = new Queue(10);
        char name[] = { 'T', 'o', 'm' };
        // Contrói uma fila a partir do array
        Queue q2 = new Queue(name);
        char ch;
        int i;

        // Insere alguns caracteres em q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Constrói uma fila a partir de outra
        Queue q3 = new Queue(q1);

        // Exibe as filas q1
        System.out.print("Conteudo de q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        // Exibe as filas q2
        System.out.print("Conteudo de q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");
        // Exibe as filas
        System.out.print("Conteudo de q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}