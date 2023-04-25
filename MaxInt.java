/*
 * This java program return the maximum integer value using generic
 */

package generics;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 *This is generic class of program and T is generic variable
 * @param <T>
 */

class MyGeneric<T> {

	private T t1;
	private T t2;
	private T t3;

	/*
	 * This constructor for parameters
	 */

	public MyGeneric(T t1, T t2, T t3) {
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
	 * To define method which return maximum value
	 */
	public int findMax(int a, int b, int c) {

		int max = Math.max(Math.max(a, b), c);

		return max;
	}
}

/*
 * This is main class of program
 */

public class MaxInteger {

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integer");

		int a = sc.nextInt();

		System.out.println("Enter second integer");

		int b = sc.nextInt();

		System.out.println("Enter third integer");

		int c = sc.nextInt();

		/*
		 * To create generic class object
		 */

		MyGeneric<Integer> gen1 = new MyGeneric<Integer>(a, b, c);

		/*
		 * To call method findmax();
		 */

		System.out.println("Maximum number is " + gen1.findMax(gen1.getT1(), gen1.getT2(), gen1.getT3()));
	}
}
