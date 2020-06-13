
/*
    Acesso público versus privado
*/
public class MyClass {
    // Acesso publico versus privado
    private int alpha; // acesso privado
    public int beta; // acesso publico
    int gamma; // acesso padrão

    /* Métodos para acessar alpha. Não há problemas
        em um membro de uma classe acessar um membro
        privado da mesma classe.
    */
    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }

}