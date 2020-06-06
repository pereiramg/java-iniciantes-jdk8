/*
    O corpo de uma laço pode estar vazio
*/
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum =0;
        for (i = 1; i <= 5; sum += i++){ // aqui temos um efeito de retardo a soma do sum -1
            System.out.println("A soma é " + sum);
        }
    }
}