/*
    Usa continue
*/
public class ContDemo {
    public static void main(String[] args) {
        int i;

        // exibe os numeros pares entre 0 a 100
        for (i = 0; i <= 100; i++){
            if ((i%2) != 0) continue; //
            System.out.println(i);
        }
    }
}