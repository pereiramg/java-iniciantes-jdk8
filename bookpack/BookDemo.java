package bookpack;

public class BookDemo { // BookDemo também faz parte de bookpack
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginer's Guide", "Schildt", 2014);
        books[1] = new Book("Java: Uma guia completo", "Schildt", 2014);
        books[2] = new Book("A arte do Java", "Schildt and Holmes", 2003);
        books[3] = new Book("Tempestade de lagrimas vermelhas", "Clancy", 1986);
        books[4] = new Book("Na estrada", "Kerouac", 1955);

        for (int i = 0; i< books.length; i++){
            books[i].show();
        }
    }

}