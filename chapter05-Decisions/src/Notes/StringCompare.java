package Notes;

public class StringCompare {
    public static void main(String[] args) {
        String x = "abc";
        String y = new String("abc");
        if (x == y) {
            System.out.println("exactly the same");
        } else {
            System.out.println("not exactly the same");
        }

        if (x.equals(y)) {
            System.out.println("contains same content");
        } else {
            System.out.println("does not contain same content");
        }
    }
}
