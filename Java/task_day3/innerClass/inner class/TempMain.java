import java.util.function.Function;

public class TempMain {

    public static void main(String[] args) {
        float temp = Float.parseFloat(args[0]);

        // Using an anonymous class
        float temperatureConverter = new Function<Float, Float>() {
            @Override
            public Float apply(Float celsius) {
                return (celsius * 9 / 5) + 32;
            }
        }.apply(temp);

        System.out.println("Temperature is = " + temp + "°C or " + temperatureConverter + "°F");
    }
}
