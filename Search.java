/*
    Pesquisa um array usando o laço for de estilo for-each
*/
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Usa o laço for de estilo for-each para procurar val em nums
        for (int x : nums){
            if (x == val){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Valor encontrado!");
        }
    }
}