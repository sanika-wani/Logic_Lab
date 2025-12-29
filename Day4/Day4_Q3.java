package oop;


class Student1{
	final int id;
	private String name;
	
	public Student1(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class Day4_Q3 {
	public static void main(String[] args) {
		Student1 s = new Student1(101);
		s.setName("Alice");
		System.out.println(s.getId()); // 101
		//s.id = 202; // should not compile
	}
}