public class StaticMethDemo {
    public static void main(String[] args) {
        System.out.println("val é: " + StaticMeth.val);
        System.out.println("StaticMethDemo.valDiv2(): " + StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("val é " + StaticMeth.val);
        System.out.println("StaticMethDemo.valDiv2(): " + StaticMeth.valDiv2());
    }
}