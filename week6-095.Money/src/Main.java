
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        Money r1 = new Money(10, 0);
        Money r2 = new Money(7, 40);
        Money r3 = r1.minus(r2);
        System.out.println(r3.cents());

//        Money a = new Money(10, 0);
//        Money b = new Money(3, 0);
//        Money c = new Money(5, 0);
//
//        System.out.println(a.less(b));  // false
//        System.out.println(b.less(c));  // true
    }
}
