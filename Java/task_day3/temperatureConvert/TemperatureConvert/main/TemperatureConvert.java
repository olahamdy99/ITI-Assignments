//package subclass;

import java.util.function.Function;

class TemperatureConvert implements Function<Float,Float>{


	@Override
	public Float apply(Float Celsius)
	{
		Float Fahrenheit= (Celsius * 9/5) + 32;

		return Fahrenheit;
	}
}
