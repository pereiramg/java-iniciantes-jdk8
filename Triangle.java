// uma subclasse de TwoDShape para triângulo
public class Triangle extends TwoDShape {
                    // Triangle herda TwoDShape
    private String style;

    // construtor padrão
    Triangle(){
        super();
        style = "none";
    }

    // construtor
    Triangle(String s, double w, double h){
        super(w, h); // chama construtor da superclasse
        // setHeight(h);
        // setWidth(w);
        style = s;
    }

    // construtor com um argumento
    Triangle(double x){
        super(x); // chama construtor da superclasse
        style = "filled";
    }

    double area(){
        // Triangle pode referenciar os membros de TwoDShape como
        // se fosse seus
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle é " + style);
    }

}