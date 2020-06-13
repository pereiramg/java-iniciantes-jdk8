/*

*/
public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 tem mais dimensões que as de ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 tem mais dimensões que as de ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 tem mais volume que as de ob3: " + ob1.sameVolume(ob3));
    }
}