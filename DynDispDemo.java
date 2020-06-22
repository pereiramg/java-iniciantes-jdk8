public class DynDispDemo {
    public static void main(String[] args) {
        Sup superob = new Sup();
        Sub1 subob1 = new Sub1();
        Sub2 subob2 = new Sub2();

        Sup supref;
        // Em cada caso, a versão de who() a ser chamada é determinada no
        // tempo de execução pelo tipo de objeto referenciado
        
        supref = superob;
        supref.who();

        supref = subob1;
        supref.who();

        supref = subob2;
        supref.who();

    }

}