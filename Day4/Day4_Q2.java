package oop;

class Rectangle{
	private double w = 0;
	private double h = 0;
	
	public double getWidth(){
		return w;
	}
	
	public double getHeight(){
		return h;
	}
	
	public void setWidth(double newW) {
		if(newW > 0) {
			w= newW;
		}
	}
	
	public void setHeight(double newH) {
		if(newH > 0) {
			h= newH;
		}
	}
	
	public double area() {
		return w*h;
	}
	public double perimeter() {
		return 2*(w+h);
	}
	
}

public class Day4_Q2 {
	public static void main(String[] args) {
		System.out.println("RUNNING Day4_Q2");
	Rectangle r = new Rectangle();
	
	r.setWidth(10.0d);
	r.setHeight(5.0d);
	System.out.println(r.area());      // 50.0
	System.out.println(r.perimeter()); // 30.0
	r.setWidth(0); // silently rejected (bonus)
	System.out.println(r.getWidth());
}
}