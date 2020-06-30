package bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginer's Guide", "Schildt", 2014, 
        "McGraw-Hill Professional");
        books[1] = new ExtBook("Java: Uma guia completo", "Schildt", 2014, 
        "McGraw-Hill Professional");
        books[2] = new ExtBook("A arte do Java", "Schildt and Holmes", 2003, 
        "McGraw-Hill Professional");
        books[3] = new ExtBook("Tempestade de lagrimas vermelhas", "Clancy", 1986, 
        "Putnam");
        books[4] = new ExtBook("Na estrada", "Kerouac", 1955, "Viking");

        for (int i = 0; i< books.length; i++){
            books[i].show();
        }

        // encontra livros por autor
        System.out.println("Mostra todos os livros de Shildt.");
        for (int i = 0; i < books.length; i++){
            if (books[i].getAuthor() == "Schildt"){
                System.out.println(books[i].getAuthor());
            }
        }
        // books[0].title = "test title"; // erro - não pode ser acessado
        // o acesso a um campo protected não é permitido a não subclasses
    }
}