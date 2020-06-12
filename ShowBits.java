/*
    Uma classe que exibe a representação binaria de um valor
*/
public class ShowBits {

    int numbites;

    // metodo construtor
    ShowBits(int n) {
        numbites = n;
    }

    void show(long val) {
        long mask = val;

        // Desloca 1 para a esquerda para a posição apropriada
        mask <<= numbites - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();

    }
}