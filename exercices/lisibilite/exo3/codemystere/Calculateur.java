package exo3.codemystere;

public class Calculateur {

    public static void main(String[] args) {
        double p = 200.0;
        double r = 0.15;
        System.out.println("Votre total est de " + cR(p, r));
    }

    private static double cR(double a, double b) {
        boolean c = b > 0 && b < 1;
        if (!c) {
            b = 0;
        }
        return cC(a, b);
    }

    private static double cC(double x, double y) {
        double z;
        if (y > 0) {
            z = x - (x * y);
        } else {
            z = x;
        }
        return aR(z);
    }

    private static double aR(double w) {
        return Math.round(w * 100.0) / 100.0;
    }
}
