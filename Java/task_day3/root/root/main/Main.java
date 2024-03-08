public class Main {
    public static void main(String[] args) {
        QuadraticRoots quadraticRoots = new QuadraticRoots();

        Double[] arr = {1.0, -3.0, 2.0};
        Double d = null; 

        String roots = quadraticRoots.apply(arr, d);

        System.out.println("Roots:");
        System.out.println(roots);
    }
}
