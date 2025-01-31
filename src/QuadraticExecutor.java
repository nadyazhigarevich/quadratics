public class QuadraticExecutor {
    private QuadraticService quadraticService;

    public QuadraticExecutor(QuadraticService quadraticService) {
        this.quadraticService = quadraticService;
    }

    public void execute(Quadratic quadratic) {
        try {
            this.executeDiscriminant(quadratic);
            this.executeBranches(quadratic);
            this.executeRoots(quadratic);
            this.executeVertex(quadratic);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void executeDiscriminant(Quadratic quadratic) {
        System.out.println("Discriminant: " + quadraticService.calculateDiscriminant(quadratic));
    }

    private void executeBranches(Quadratic quadratic) {
        System.out.println("Branches: directed " + quadraticService.getBranches(quadratic));
    }

    private void executeRoots(Quadratic quadratic) {
        System.out.println("Roots: " + quadraticService.getRoots(quadratic)[0] + "; " + quadraticService.getRoots(quadratic)[1]);
    }

    private void executeVertex(Quadratic quadratic) {
        System.out.println("Vertex: (" + quadraticService.getVertex(quadratic)[0] + ", " + quadraticService.getVertex(quadratic)[1] + ")");
    }
}
