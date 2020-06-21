// Uma hierarquia de classe simples
// Uma classe para objetos de duas dimensões
// Adiciona um construtor a Triangle
// Adiciona construtores a TwoDShape
// Adiciona mais construtores a TwoDShape
// Hierarquia de varios niveis
/**
 * TwoDShape
 */
public class TwoDShape {

    private double width, height;

    // Construtor padrão
    TwoDShape(){
        width = height = 0.0;
    }

    // Construtor parametrizado
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais
    TwoDShape(double x){
        width = height = x;
    }

    // membros acessadores para width e height
    double getWidth(){ return width;}
    double getHeight(){ return height;}
    void setWidth(double w){ width = w;}
    void setHeight(double h){ height = h;}

    void showDim(){
        System.out.println("Largura e altura são: " + width + " e " + height);
    }
}