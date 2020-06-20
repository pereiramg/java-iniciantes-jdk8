// uma hierarquia de classe simples

// uma classe para objetos de duas dimensões

/**
 * TwoDShape
 */
public class TwoDShape {

    private double width, height;

    // membros acessadores para width e height
    double getWidth(){ return width;}
    double getHeight(){ return height;}
    void setWidth(double w){ width = w;}
    void setHeight(double h){ height = h;}

    void showDim(){
        System.out.println("Largura e altura são: " + width + " e " + height);
    }
}