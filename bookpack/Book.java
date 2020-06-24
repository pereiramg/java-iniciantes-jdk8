// demostração breve de pacotes
package bookpack; // esse arquivo faz parte do pacote bookpack

public class Book { // logo book faz parte de bookpack
    private String title, author;
    private int pubDate;

    Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }

}