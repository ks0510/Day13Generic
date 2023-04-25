/*
 * This java program return the maximum floating value using generic
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

class GenericNew<T> {

	private T t1;
	private T t2;
	private T t3;

	/*
	 * This constructor for parameters
	 */

	public GenericNew(T t1, T t2, T t3) {
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
	 * To define method which find maximum floating value
	 */

	public float findMax(float a, float b, float c) {

		float max = Math.max(Math.max(a, b), c);

		return max;
	}
}

/*
 * This is main class of program
 */

public class MaxFloat {

	/**
	 * This is our main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To generate generic class object
		 */

		GenericNew<Float> gen1 = new GenericNew<Float>(6.6f, 7.8f, 9.1f);

		/*
		 * To call out findMax method for maximum floating value
		 */

		System.out.println("The largest number is " + gen1.findMax(gen1.getT1(), gen1.getT2(), gen1.getT3()));
	}

}
