/*
    Os efeitos colaterais podem ser importantes
*/

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;

        // Aqui i é incrementado mesmo que a instrução if seja falsa
        if (false & (++i < 100)) System.out.println("proximo valor será: " + i);

        // Nesse caso, i não é incrementado porque o operador de curto-
        // circuito ignora o incremento
        if (false && (++i < 100)) System.out.println("proximo valor será: " + i);
    }
}