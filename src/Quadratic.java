public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        setA(a);
        this.b = b;
        this.c = c;
    }

    public Quadratic() {

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        if (a == 0) {
            throw new RuntimeException("Not a quadratic equation");
        } else {
            this.a = a;
        }
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
