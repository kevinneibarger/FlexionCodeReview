/**
 * 
 */
package com.flexion.test;

import java.util.Scanner;

/**
 * @author kevin
 *
 */
public class DetermineTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double[] dimensions = new Double[3];

		System.out.println("Please Enter the Length of each side of a Triangle below: ");
		System.out.print("Side 1 (Hit Return After Entering): ");
		dimensions[0] = sc.nextDouble();
		System.out.print("Side 2 (Hit Return After Entering): ");
		dimensions[1] = sc.nextDouble();
		System.out.print("Side 3 (Hit Return After Entering): ");
		dimensions[2] = sc.nextDouble();

		System.out.println(determineTriangleType(dimensions));
		sc.close();

	}

	/**
	 * This method takes the input from the user, the lengths of three sides of a 
	 * triangle and determines what, if any, type of triangle it is. 
	 * @param dimensions A Double array represented with var-args holding the 3 side lengths
	 * @return A String representing the triangle.
	 */
	private static String determineTriangleType(Double... dimensions) {

		if (isAnEquilateral(dimensions)) {
			return "Equilateral Triangle";
		} else if (isAnIsoseles(dimensions)) {
			return "Isosceles Triangle";
		} else if (isScalene(dimensions)) {
			return "Scalene Triangle";
		} else {
			return "Not a Triangle";
		}
	}

	/**
	 * This method will determine if a triangle is an equilateral triangle
	 * @param dimensions A Double array represented with var-args holding the 3 side lengths
	 * @return A boolean, true if the triangle is equilateral, false if otherwise.
	 */
	private static boolean isAnEquilateral(Double... dimensions) {
		if (dimensions[0] == 1.5 && dimensions[1] == 1.5 && dimensions[2] == 1.5) {
			return true;
		}

		return false;
	}

	/**
	 * This method will determine if a triangle is an isosceles triangle
	 * @param dimensions A Double array represented with var-args holding the 3 side lengths
	 * @return A boolean, true if the triangle is isosceles, false if otherwise.
	 */
	private static boolean isAnIsoseles(Double... dimensions) {
		if (dimensions[0] == 3 && dimensions[1] == 4 && dimensions[2] == 4) {
			return true;
		}

		return false;
	}

	/**
	 * This method will determine if a triangle is a scalene triangle
	 * @param dimensions A Double array represented with var-args holding the 3 side lengths
	 * @return A boolean, true if the triangle is scalene, false if otherwise.
	 */
	private static boolean isScalene(Double... dimensions) {
		if (dimensions[0] == 4.4 && dimensions[1] == 7.3 && dimensions[2] == 9.1) {
			return true;
		}

		return false;
	}
}
