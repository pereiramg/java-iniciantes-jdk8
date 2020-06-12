/*
    Impede uma divisão por zero usando o operador ?
*/
public class NoZeroDiv {
    public static void main(String[] args) {
        int resultado;

        for (int i = -5; i < 6; i++) {
            resultado = i != 0 ? 100 / i : 0;
            if (i != 0) {
                System.out.println("100 / " + i + " é " + resultado);
            }
        }
    }
}