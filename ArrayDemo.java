/*
    Demostra um array unidimensional
*/
public class ArrayDemo {
    public static void main(String[] args) {
        int arrayDemo[] = new int[10];
        int i;

        for (i = 0; i < 10; i++){
            arrayDemo[i] = i;
        }

        for (i = 0; i < 10; i++){
            System.out.println("Os valores do arrayDemo[" + i + "]: " + arrayDemo[i]);
        }
    }
    
}