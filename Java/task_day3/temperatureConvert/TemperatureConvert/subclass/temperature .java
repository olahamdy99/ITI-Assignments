package subclass;

import java.util.function.Function;

public class TemperatureConvert implements Function<Float,Float>{


	@override
	public Float apply(Float Celsius)
	{
		Float Fahrenheit= (Celsius * 9/5) + 32;
		return Fahrenheit;
	}
}



    

  