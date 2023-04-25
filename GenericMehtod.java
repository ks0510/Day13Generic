/*
 * This java program gives maximum integer,double value and longest string
 */
package generics;

import java.util.*;

/**
 * This is generic class of program and T is generic variable
 * 
 * @author Kaif
 *
 * @param <T>
 */

class GenericNew2<T> {

	private T t1;
	private T t2;
	private T t3;

	/*
	 * This constructor for parameters
	 */

	public GenericNew2(T t1, T t2, T t3) {
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
	 * To define method which report maximum object value
	 */

	public static <T extends Comparable<T>> T maximum(T t1, T t2, T t3) {
		T max = t1; //

		if (t2.compareTo(max) > 0)
			max = t2;

		if (t3.compareTo(max) > 0)
			max = t3;

		return max;
	}

	/*
	 * To define method which report maximum string value
	 */

	public static String testMaximum(String t1, String t2, String t3) {

		String max = t1;

		if (t2.compareTo(max) > 0)
			max = t2;

		if (t3.compareTo(max) > 0)
			max = t3;

		return max;

	}
}

/*
 * This is main class of program
 */

public class GenericMethod {

	/**
	 * This is main function of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * To take values from user
		 */

		System.out.println("For Integer");

		System.out.println("Enter first integer");

		int a = sc.nextInt();

		System.out.println("Enter second integer");

		int b = sc.nextInt();

		System.out.println("Enter third integer");

		int c = sc.nextInt();

		System.out.println("For double value");

		System.out.println("Enter  first number");

		double p = sc.nextDouble();

		System.out.println("Enter  second number");

		double q = sc.nextDouble();

		System.out.println("Enter  third number");

		double r = sc.nextDouble();

		System.out.println("For strings");

		System.out.println("Enter first string");

		String x = sc.next();

		System.out.println("Enter second string");

		String y = sc.next();

		System.out.println("Enter third string");

		String z = sc.next();

		/*
		 * To create generic objects for integer,double and string
		 */

		GenericNew2<Integer> gen1 = new GenericNew2<Integer>(a, b, c);

		GenericNew2<Double> gen2 = new GenericNew2<Double>(p, q, r);

		GenericNew2<String> gen3 = new GenericNew2<String>(x, y, z);

		/*
		 * To call out respective method and display the output
		 */

		System.out.println(gen1.maximum(gen1.getT1(), gen1.getT2(), gen1.getT3()));

		System.out.println(gen2.maximum(gen2.getT1(), gen2.getT2(), gen2.getT3()));

		System.out.println(gen3.testMaximum(gen3.getT1(), gen3.getT2(), gen3.getT3()));
	}
}
