/*
    Coleta de lixo
*/
public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        // começando a gerar varias objetos
        for (count = 1; count < 1000000; count++){
            ob.generator(count);
        }
    }
}