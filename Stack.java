
/*
    Classe de pilha para caracteres
*/
public class Stack {
    private char stck[]; // esse array contem a pilha
    private int tos; // topo de linha

    // constrói uma pilha vazia dado seu tamanho
    Stack(int size){
        stck = new char[size]; // aloca memoria para o stack
        tos = 0;
    }

    // constrói uma pilha a partir de outra
    Stack (Stack ob){
        tos = ob.tos;
        stck = new char[ob.stck.length];

        // copia os elementos
        for (int i = 0; i < tos; i++){
            stck[i] = ob.stck[i];
        }
    }

    // Constrói uma pilha com valores inciais
    Stack(char a[]){
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++){
            push(a[i]);
        }
    }

    // insere caracateres na pilha
    void push(char ch){
        if (tos == stck.length){
            System.out.println(" -- Já está cheio o array");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    // extrai um caractere da pilha
    char pop(){
        if (tos == 0){
            System.out.println(" -- Pilha está vazia");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}