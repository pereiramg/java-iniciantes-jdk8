/*
    Usa laço for de estilo for-each
*/
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Usa laço dor de estilo for-each para exibir e somar os valores
        
        for (int x: nums){
            sum += x;
        }

        System.out.println("Soma dos valores no array x: " + sum);
    }
    
}