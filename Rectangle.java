// Uma subclasse de TwoDhape para retangulos
public class Rectangle extends TwoDShape {
    
    boolean isSquare(){
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}