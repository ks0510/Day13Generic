/*
 * This java program to find longest string using generic 
 */

package generics;

import java.util.*;

/**
 * This is a generic class and T is a generic variable
 * 
 * @author Kaif
 *
 * @param <T>
 */

class Generic1<T> {

	private T t1;
	private T t2;
	private T t3;

	/*
	 * This constructor for parameters
	 */

	public Generic1(T t1, T t2, T t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	/*
	 * To define setter and getter method for parameters
	 */

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}

	public T getT3() {
		return t3;
	}

	public void setT3(T t3) {
		this.t3 = t3;
	}

	/*
	 * To define method which return longest string
	 */

	public static String findMax(String a, String b, String c) {

		String longest = a;
		if (b.length() > longest.length()) {
			longest = b;
		}
		if (c.length() > longest.length()) {
			longest = c;
		}
		return longest;
	}
}

/*
 * This is main class of program
 */

public class MaxString {

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string");

		String a = sc.next();

		System.out.println("Enter second string");

		String b = sc.next();

		System.out.println("Enter third string");

		String c = sc.next();

		/*
		 * To create generic class object and putting arguments from user input
		 */

		Generic1<String> gen1 = new Generic1<String>(a, b, c);

		System.out.println("Largest string is " + gen1.findMax(gen1.getT1(), gen1.getT2(), gen1.getT3()));
	}
}

