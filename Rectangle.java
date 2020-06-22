// Uma subclasse de TwoDhape para retangulos
public class Rectangle extends TwoDShape {
    
    // construtor padrão
    Rectangle(){
        super();
    }

    // construtor para Rectangle
    Rectangle(double w, double h){
        super(w, h, "Rectangle"); // chama cosntrutor da superclasse
    }

    // constrói um quadrado
    Rectangle(double x){
        super(x, "Rectangle"); // chama cosntrutor da superclasse
    }

    Rectangle(Rectangle ob){
        super(ob); // passa objeto para construtor de TwoDhape
    }

    boolean isSquare(){
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}