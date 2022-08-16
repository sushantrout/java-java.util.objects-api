package com.tech;

import java.util.Comparator;
import java.util.Objects;

public class ObjectEqualsDemo {
	public static void main(String[] args) {

		Employee sushant = new Employee("Sushant", 26, false);
		Employee avay = new Employee("Avay", 26, false);

		boolean oEquals = Objects.equals(sushant, avay);
		System.out.println(oEquals);

		int[] fArray = { 1, 2, 3 };
		int[] sArray = { 1, 2, 3 };

		boolean equal = Objects.equals(fArray, sArray);
		System.out.println(equal);
		boolean deepEquals = Objects.deepEquals(fArray, sArray);
		System.out.println(deepEquals);

		/*
		 * Objects.hash() can take one or more objects and provides a hashcode for them.
		 * Under the hood, the hash() method works by putting the supplied objects into
		 * an array and calling Arrays.hashCode() on them.
		 */

		int hashCode = Objects.hashCode(sushant);
		System.out.println(hashCode);

		int hashCodes = Objects.hash(fArray);
		System.out.println(hashCodes);

		// toString(Object o)
		String string = Objects.toString(sushant);
		System.out.println(string);

		// .toString(Object o, String nullDefault)
		String nullDefault = Objects.toString(null, "NO value");
		System.out.println(nullDefault);

		// .compare(T a, T b, Comparator<? super T> c)
		int compare = Objects.compare(sushant, avay, Comparator.comparing(Employee::getName));
		System.out.println(compare);

		// isNull(Object obj)
		boolean isNUll = Objects.isNull(null);
		System.out.println(isNUll);
		try {
			// requireNonNull(Integer obj)
			Object requireNonNull = Objects.requireNonNull(compare);
			System.out.println(requireNonNull);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// requireNonNull(Object obj, String message)
			Objects.requireNonNull(null, nullDefault);// java.lang.NullPointerException: NO
																				// value
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean nonNull = Objects.nonNull(null);
		System.out.println(nonNull);
		
		//requireNonNull(Object obj, Supplier<String> messageSupplier)
		Objects.requireNonNull(null, () -> {
			return "No Data found yarrr";
		});

	}
}
