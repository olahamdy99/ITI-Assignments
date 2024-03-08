public class Main {

    public static void main(String[] args) {

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);

        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        Complex<Double> complex1 = new DoubleComplex(x1, y1);
        Complex<Double> complex2 = new DoubleComplex(x2, y2);

        Complex<Double> sum = complex1.add(complex2);
        Complex<Double> sub = complex1.subtract(complex2);
        Complex<Double> mult = complex1.multiply(complex2);
        Complex<Double> div = complex1.divide(complex2);

        // Print the results
        System.out.println("Complex 1: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
        System.out.println("Complex 2: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("subtract : " + sub.getReal() + " + " + sub.getImaginary() + "i");
        System.out.println("multiply : " + mult.getReal() + " + " + mult.getImaginary() + "i");
        System.out.println("divide: " + div.getReal() + " + " + div.getImaginary() + "i");
    }
}
