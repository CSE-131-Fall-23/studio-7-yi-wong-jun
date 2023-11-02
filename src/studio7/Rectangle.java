package studio7;

import java.util.Scanner;

public class Rectangle {
	int length;
	int width;
	int area;
	boolean isSquare;
	
	/**
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	public int getArea() {
		return this.length * this.width;
	}
	
	public boolean compare(Rectangle other) {
		return this.getArea() < other.getArea();
	}

	public static void main(String[] args) {
		Rectangle a = new Rectangle (3,4);
		System.out.println(a.getArea());
		
		Rectangle b = new Rectangle (5,9);
		System.out.println(a.compare(b));
	}
}
