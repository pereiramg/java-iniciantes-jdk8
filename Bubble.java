/*
    Demostra a classificação por bolhas
*/
public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t, size;

        size = 10; //número de elemento a serem classificados

        // exibe o array original
        System.out.print("Array original:");
        for (int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        // classificação por bolha
        for (a = 0; a < size; a++){
            for (b = size -1; b > a; b--){
                if (nums[b - 1] > nums[b]){ //se fora de ordem
                    // troca o elemento
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        // exibe o array classificado
        System.out.print(" Ajuste do array: ");
        for (int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }
        System.out.println();

    }
    
}