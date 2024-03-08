class TempMain{
public static void main(String[] args) {
    float temp = Float.parseFloat(args[0]);
    
   float result = new TemperatureConvert().apply(temp);
 System.out.println("Temperature is = " + temp + "°C or " + result + "°F");
}
}
