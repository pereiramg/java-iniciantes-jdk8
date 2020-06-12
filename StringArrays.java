/*
    Demostra arrays de Strings
*/
public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "a", "test."};

        System.out.println("Array original ");
        for (String s : strs){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // altera um string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Array modificado: ");
        for (String s : strs){
            System.out.print(s + " ");
        }
    }
}