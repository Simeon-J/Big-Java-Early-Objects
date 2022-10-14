package Notes;

public class FloatCompare {

    public static void main(String[] args) {
        double r = Math.sqrt(2);
        double d = r * r - 2;
        if (d == 0) {
            System.out.println("sqrt(2) - 2 is 0");
        } else {
            System.out.println("sqrt(2) - 2 is " + d);
        }
        // Wrong answer due to roundoff error

        final double EPSILON = 1E-14;
        double x = Math.sqrt(2);
        double y = 2;
        if (Math.abs((x * x) - y) <= EPSILON) {
            System.out.println("sqrt(2) - 2 is 0");
        }
        // correction made by approximating difference in values

    }
}
