/*
    Calcula quantas polegadas cúbicas há em uma milha cúbica
*/

public class Inches {
    public static void main(String[] args) {
        // definição de variaveis
        long ci, im;

        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("Aqui possui " + ci + " polegadas cubicas em milha cubica");
    }
    
}