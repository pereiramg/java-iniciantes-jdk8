/*
    Teste quick Sort
*/
public class QuickSortDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Array original: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        // Agora, classifica o array
        Quicksort.qsort(a);
        System.out.print("Array Ajustado: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i]);
        } 
    }
}