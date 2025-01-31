public class QuadraticServiceImpl implements QuadraticService {
    @Override
    public double calculateDiscriminant(Quadratic quadratic) {
        return Math.pow(quadratic.getB(), 2) - 4 * quadratic.getA() * quadratic.getC();
    }

    @Override
    public String getBranches(Quadratic quadratic) {
        return quadratic.getA() > 0 ? BranchesDirections.UP.name() : BranchesDirections.DOWN.name();
    }

    @Override
    public Roots getRoots(Quadratic quadratic) {
        double discriminant = calculateDiscriminant(quadratic);
        if (discriminant > 0) {
            double root1 = (-quadratic.getB() + Math.sqrt(discriminant)) / (2 * quadratic.getA());
            double root2 = (-quadratic.getB() - Math.sqrt(discriminant)) / (2 * quadratic.getA());
            return new Roots(root1, root2);
        }
        if (discriminant == 0) {
            double root = -quadratic.getB() / (2 * quadratic.getA());
            return new Roots(root, null);
        } else {
            throw new RuntimeException("No roots");
        }
    }

    @Override
    public Vertex getVertex(Quadratic quadratic) {
        double x = -quadratic.getB() / (2 * quadratic.getA());
        double y = (quadratic.getA() * Math.pow(x, 2)) + (quadratic.getB() * x) + quadratic.getC();
        return new Vertex(x, y);
    }
}
