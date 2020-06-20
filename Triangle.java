// uma subclasse de TwoDShape para triângulo
public class Triangle extends TwoDShape {
                    // Triangle herda TwoDShape
    String style;

    double area(){
        // Triangle pode referenciar os membros de TwoDShape como
        // se fosse seus
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle é " + style);
    }

}