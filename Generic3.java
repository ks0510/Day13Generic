/*
 * This java program gives maximum integer,double value and longest string
 * using three generic variable
 */

package generics;

import java.util.*;

/**
 * This is generic class and T1,T2 and T3 are three generic variables
 * 
 * @author Kaif
 *
 * @param <T1>
 * @param <T2>
 * @param <T3>
 */

class GenericNew3<T1, T2, T3> {

	private T1 p;
	private T2 q;
	private T3 r;

	/*
	 * To define constructor for parameters
	 */

	public GenericNew3(T1 p, T2 q, T3 r) {
		super();
		this.p = p;
		this.q = q;
		this.r = r;
	}

	/*
	 * To define setter and getter method for parameters
	 */

	public T1 getP() {
		return p;
	}

	public void setP(T1 p) {
		this.p = p;
	}

	public T2 getQ() {
		return q;
	}

	public void setQ(T2 q) {
		this.q = q;
	}

	public T3 getR() {
		return r;
	}

	public void setR(T3 r) {
		this.r = r;
	}

	/*
	 * To define method which report maximum objectvalue
	 */

	public static <T extends Comparable<T>> T maximum(T t1, T t2, T t3) {
		T max = t1;

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

/**
 * This is our main class of program
 * 
 * @author Kaif
 *
 */

public class Generic3 {

	public static void main(String[] args) {

		/*
		 * To create generic objects for integer,float and string
		 */

		GenericNew3<Integer, Integer, Integer> gen1 = new GenericNew3<Integer, Integer, Integer>(8, 9, 10);

		GenericNew3<Float, Float, Float> gen2 = new GenericNew3<Float, Float, Float>(8.1f, 7.9f, 10.1f);

		GenericNew3<String, String, String> gen3 = new GenericNew3<String, String, String>("Apple", "Peach", "Bannana");

		/*
		 * To call out respective method and display the output
		 */

		System.out.println(gen1.maximum(gen1.getP(), gen1.getQ(), gen1.getR()));

		System.out.println(gen2.maximum(gen2.getP(), gen2.getQ(), gen2.getR()));

		System.out.println(gen3.testMaximum(gen3.getP(), gen3.getQ(), gen3.getR()));
	}
}
