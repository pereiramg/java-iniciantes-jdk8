// essa classe está no pacote bookpackext
package bookpackext;

// usa a classe Book a partir de bookpack
class UseBook {
    public static void main(String[] args) {
        bookpack.Book books[] = new bookpack.Book[5];

        books[0] = new bookpack.Book("Java: A Beginer's Guide", "Schildt", 2014);
        books[1] = new bookpack.Book("Java: Uma guia completo", "Schildt", 2014);
        books[2] = new bookpack.Book("A arte do Java", "Schildt and Holmes", 2003);
        books[3] = new bookpack.Book("Tempestade de lagrimas vermelhas", "Clancy", 1986);
        books[4] = new bookpack.Book("Na estrada", "Kerouac", 1955);

        for (int i = 0; i< books.length; i++){
            books[i].show();
        }

    }
    
}