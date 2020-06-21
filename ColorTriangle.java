// Estende Triangle
// ColorTriangle herda Triangle, que é descendente de TwoDShape
// portanto, ColorTriangle inclui todos os membros de Triangle e TwoDShape
public class ColorTriangle extends Triangle {
    
    private String color;

    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color = c;
    }

    String getColor(){ return color; }
    
    void showColor(){
        System.out.println("Color é: " + color);
    }
}