// Subclasse de TwoDShape para circulos
public class Circle extends TwoDShape {
    // Um costrutor padrão
    Circle(){
        super();
    }

    // Constrói circulo
    Circle(double x){
        super(x, "circle"); // Chama o construtor da superclasse
    }

    // Cosntrói um objeto a partir de outro
    Circle(Circle ob){
        super(ob); // passa o objeto para o construtor de TwoDShape
    }

    double area(){
        return (getWidth() / 2) * (getHeight() / 2) * 3.1416;
    }
}