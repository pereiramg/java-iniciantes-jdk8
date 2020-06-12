/*
    Usa substring()
*/
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java foi feito para a WEB";

        // controi um substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}