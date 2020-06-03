public class PolegasToMetros {
    public static void main(String args[]) {
        /*
         * Tabela de conversão de Polegadas para Metros. Tabela de 12 em 12 Metro é igual
         * a 39,37 polegadas
         */
        double polegadas, metros;
        int contador = 0;

        for (polegadas = 1; polegadas <= 100; polegadas++) {
            metros = polegadas * 39.37;
            System.out.println(polegadas + " polegadas é " + metros + " metros");
            contador++;

            if (contador == 12) {
                System.out.println();
                contador = 0;
            }

        }

    }

}