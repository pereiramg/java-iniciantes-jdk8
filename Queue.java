/*
    Uma classe de fila para caracteres
*/
public class Queue {

    private char q[]; // esse array contem a fila
    private int putloc, getloc; // os indices put e get

    // Constrói uma fila vazia dado seu tamanho
    Queue(int size){
        q = new char[size]; // aloca memoria para a fila
        putloc = getloc = 0;
    }

    // Constrói uma fila a partir de outra
    Queue (Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copia elementos
        for (int i = getloc; i < putloc; i++){
            q[i] = ob.q[i];
        }
    }

    // constrói uma fila com valores iniciais
    Queue(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++){
            put(a[i]);
        }
    }

    // insere um caractere na fila
    void put (char ch){
        if (putloc == q.length){
            System.out.println(" - Fila está cheio");
            return;
        }
        q[putloc++] = ch;
    }

    // obtem um caractere na fila
    char get(){
        if (getloc == putloc){
            System.out.println(" - Fila está vazia.");
            return (char) 0;
        }
        return q[getloc++];
    }
}