/*
    Usando o break com um rotulo
*/
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++){
            one: {
                two: {
                    three: {
                        System.out.println("\ni é " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        // essa parte nunca será alcançada
                        System.out.println("Nunca será impresso na tela");
                    }
                    System.out.println("Depois do bloco 3");
                }
                System.out.println("Depois do bloco 2");
            }
            System.out.println("Depois do bloco 1");
        }
        System.out.println("Depois do for");
    }
    
}