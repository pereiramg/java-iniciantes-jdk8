/*
    Usa o membro de array length
*/
public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        int table[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        System.out.println("O tamanho da lista é " + list.length);
        System.out.println("O tamanho da nums é " + nums.length);
        System.out.println("O tamanho da table é " + table.length);
        System.out.println("O tamanho da table[0] é " + table[0].length);
        System.out.println("O tamanho da table[1] é " + table[1].length);
        System.out.println("O tamanho da table[2] é " + table[2].length);
        System.out.println();

        // Usa length para inicializar list
        for (int i = 0; i < list.length; i++) {
            list[i] = i * 1;
        }
        System.out.println("Aqui é uma lista: ");
        // Agora usa length para exibir uma lista
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}