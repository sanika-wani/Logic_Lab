package oop;
class Temperature{
	private final double celsius;
	
	Temperature(double celsius){
		this.celsius = celsius;
	}
	
	double toFahrenheit() {
		return (9/5.0)*(this.celsius)+32;
	}
	
	//returning an object from  a method.
	Temperature withCelsius(double c) {
		return new Temperature(c);
	}
	
}
public class Day4_Q8 {
	public static void main(String[] args) {
		Temperature t = new Temperature(25.0);
        System.out.println(t.toFahrenheit()); // 77.0

        Temperature t2 = t.withCelsius(30.0);
        System.out.println(t2.toFahrenheit()); // 86.0
        System.out.println(t.toFahrenheit());  // 77.0 (unchanged)
	}
}
