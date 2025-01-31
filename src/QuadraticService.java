public class QuadraticService {
    public double calculateDiscriminant(Quadratic quadratic) {
        return Math.pow(quadratic.getB(), 2) - 4 * quadratic.getA() * quadratic.getC();
    }

    public String getBranches(Quadratic quadratic) {
        return quadratic.getA() > 0 ? "vverh" : "vniz";
    }

    public double getRoots(Quadratic quadratic) {
        if (calculateDiscriminant(quadratic) > 0) {
            return (-quadratic.getB() + Math.sqrt(calculateDiscriminant(quadratic))) / (2 * quadratic.getA());
        }
        if (calculateDiscriminant(quadratic) == 0) {
            return -quadratic.getB() / (2 * quadratic.getA());
        } else {
            throw new RuntimeException("No roots");
        }
    }

    public double[] getVertex(Quadratic quadratic) {
        double x = -quadratic.getB() / (2 * quadratic.getA());
        double y = calculateDiscriminant(quadratic) / (4 * quadratic.getA());
        return new double[]{x, y};
    }
}
