/*
    Objetos são passados por suas referencias
*/
public class PassObRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b antes da chamada: " + ob.a + " " + ob.b);
        ob.change(ob);

        System.out.println("ob.a and ob.b depois da chamada: " + ob.a + " " + ob.b);
        
    }
}