/*
    Introduz a String
*/
public class StringDemo {
    public static void main(String[] args) {
        // declara strings dde varias maneiras
        String str1 = new String("Java String são objetos");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}