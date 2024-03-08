import java.util.function.BiFunction;

public class QuadraticRoots implements BiFunction<Double[], Double, String> {

    @Override
    public String apply(Double[] arr, Double d) {
        double a = arr[0];
        double b = arr[1];
        double c = arr[2];

        d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            return "Root 1: " + root1 + ", Root 2: " + root2;
        } 
	else if (d == 0) {
            double root = -b / (2 * a);
            return "Root: " + root;
        } 
	else {
            return "No real roots";
        }
    }
}

