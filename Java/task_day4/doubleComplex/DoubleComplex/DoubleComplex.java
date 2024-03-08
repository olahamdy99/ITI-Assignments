public class DoubleComplex implements Complex<Double> {
    
    private final double real;
    private final double imaginary;
    
    public DoubleComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    @Override
    public Double getReal() {
        return real;
    }
    
    @Override
    public Double getImaginary() {
        return imaginary;
    }
    
    @Override
    public Complex<Double> add(Complex<Double> z) {
        double newReal = real + z.getReal();
        double newImaginary = imaginary + z.getImaginary();
        return new DoubleComplex(newReal, newImaginary);
    }
    
    @Override
    public Complex<Double> subtract(Complex<Double> z) {
        double newReal = real - z.getReal();
        double newImaginary = imaginary - z.getImaginary();
        return new DoubleComplex(newReal, newImaginary);
    }
    
    @Override
    public Complex<Double> multiply(Complex<Double> z) {
        double newReal = real * z.getReal() - imaginary * z.getImaginary();
        double newImaginary = real * z.getImaginary() + imaginary * z.getReal();
        return new DoubleComplex(newReal, newImaginary);
    }
    
    @Override
    public Complex<Double> divide(Complex<Double> z) {
        double dem = z.getReal() * z.getReal() + z.getImaginary() * z.getImaginary();
        double newReal = (real * z.getReal() + imaginary * z.getImaginary()) / dem;
        double newImaginary = (imaginary * z.getReal() - real * z.getImaginary()) / dem;
        return new DoubleComplex(newReal, newImaginary);
    }
}
