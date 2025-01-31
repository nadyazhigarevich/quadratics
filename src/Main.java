import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("aх2 + bx + c = 0 \nEnter the coefficients of the quadratic equation: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            QuadraticExecutor executor = new QuadraticExecutor(new QuadraticService());
            Quadratic q1 = new Quadratic(a, b, c);
            executor.execute(q1);
        }
    }
}