
public class Test {
    // Este metodo não causa alterações nos argumentos usados na chamada
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }

    // Objetos são passados por suas referencias
    int a, b;

    Test(){
        
    }

    Test(int i, int j){
        a = i;
        b = j;
    }

    // Passa um objeto. Agora, os valores ob.a e ob.b do objeto usados
    // na chamada serão alterados.
    void change(Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }

}