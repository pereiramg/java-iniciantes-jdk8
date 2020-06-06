/*
    Outro exemplo do uso de break com um rotulo
*/
public class Break5 {
    public static void main(String[] args) {
        done:
            for (int i=0;i < 10; i++){
                for (int j=0; j < 10; j++){
                    for (int k=0; k < 10; k++){
                        System.out.println(k + " ");
                        if (k == 5) break done; // desvia para done
                    }
                    System.out.println("Depois do loop de k"); //não será executado
                }
                System.out.println("Depois do loop de j"); //não será executado
            }
            System.out.println("Depois do loop de i");
    }
}