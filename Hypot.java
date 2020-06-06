/*
    Usa o teorema de Pitágoras para encontrar o 
    comprimento da hipotenusa dados os comprimentos 
    dos dois lados opostos
*/

public class Hypot {
    public static void main(String[] args) {
        // definição das variaveis
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        System.out.println("Hipotenusa é " + z);
    }

}