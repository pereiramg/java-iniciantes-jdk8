/*
    Demostra a classificação por bolha com string
*/
public class StrBubble {
    public static void main(String[] args) {
        String strs[] = {"this", "is", "a", "test", "of",
                        "a", "string", "sort"};
        int a, b, size; 
        String t;

        size = strs.length; //número de elemento a serem classificados

        // exibe o array original
        System.out.print("Array original:");
        for (int i = 0; i < size; i++){
            System.out.print(" " + strs[i]);
        }
        System.out.println();

        // classificação por bolha
        for (a = 0; a < size; a++){
            for (b = size -1; b > a; b--){
                if (strs[b - 1].compareTo(strs[b]) > 0 ){ //se fora de ordem
                    // troca o elemento
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        }
        // exibe o array classificado
        System.out.print(" Ajuste do array: ");
        for (int i = 0; i < size; i++){
            System.out.print(" " + strs[i]);
        }
        System.out.println();
    }
}