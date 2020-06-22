// Uma hierarquia de classe simples
// Uma classe para objetos de duas dimensões
// Adiciona um construtor a Triangle
// Adiciona construtores a TwoDShape
// Adiciona mais construtores a TwoDShape
// Hierarquia de varios niveis
// Usa o despacho dinâmico de métodos
// Cria uma classe abstrata
/**
 * TwoDShape
 */
abstract class TwoDShape {

    private double width, height;
    private String name;

    // Construtor padrão
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Construtor parametrizado
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói o objeto com altura e largura iguais
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // constrói um objeto a partir de outro
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // membros acessadores para width e height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Largura e altura são: " + width + " e " + height);
    }

    // agora area é abstrata
    abstract double area();// {
    // System.out.println("Largura e Altura são: " + width +
    // " e " + height);
    // return 0.0;
    // }
}