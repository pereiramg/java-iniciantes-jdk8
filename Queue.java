/*
    Uma classe de fila para caracteres
*/
public class Queue {

    char q[]; // esse array contem a fila
    int putloc, getloc; // os indices put e get

    Queue(int size){
        q = new char[size]; // aloca memoria para a fila
        putloc = getloc = 0;
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