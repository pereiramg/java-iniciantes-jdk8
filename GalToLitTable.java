/*
    Este programa exibe uma tabela de conversões
    de galões em litros
*/

public class GalToLitTable {
    public static void main(String args[]) {
        double galoes, litros;
        int contador = 0;

        for (galoes = 1; galoes <= 100; galoes++) {
            litros = galoes * 3.7854;
            System.out.println(galoes + " galoes é " + litros + " litros");
            contador++;

            if (contador == 10) {
                System.out.println();
                contador = 0;
            }

        }

    }
}