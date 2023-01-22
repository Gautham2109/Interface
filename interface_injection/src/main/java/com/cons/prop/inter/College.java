package com.cons.prop.inter;

public class College {

	private Student std1;
	private Student std2;
	private Student std3;
	
	public Student getStd1() {
		return std1;
	}
	public void setStd1(Student std1) {
		this.std1 = std1;
	}
	public Student getStd2() {
		return std2;
	}
	public void setStd2(Student std2) {
		this.std2 = std2;
	}
	public Student getStd3() {
		return std3;
	}
	public void setStd3(Student std3) {
		this.std3 = std3;
	}
	public void demo() {
		System.out.println("Student 1 [Id : "+std1.getId()+", Name : "+std1.getName()+ ", Marks : "+std1.getMarks() +"]");
		System.out.println("Student 2 [Id : "+std2.getId()+", Name : "+std2.getName()+ ", Marks : "+std2.getMarks() +"]");
		System.out.println("Student 3 [Id : "+std3.getId()+", Name : "+std3.getName()+ ", Marks : "+std3.getMarks() +"]");
	}
}
