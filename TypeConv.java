public class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // chama ob.f(int)
        ob.f(d); // chama ob.f(double)
        ob.f(b); // chama ob.f(int) - conversão de tipo
        ob.f(s); // chama ob.f(int) - consersão de tipo
        ob.f(f); // chama ob.f(double) - consersão de tipo
        
    }
}