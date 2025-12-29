package oop;
class Counter{
	private int value;
	public static int instances;
	
	Counter(){
		
		instances+=1;
	}
	void increment() {
        value++;
    }

    void decrement() {
        value--;
    }

    int getValue() {
        return value;
    }
	
}
public class Day4_Q7 {
	public static void main(String[] args) {
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
		System.out.println(Counter.instances);
	}
}
