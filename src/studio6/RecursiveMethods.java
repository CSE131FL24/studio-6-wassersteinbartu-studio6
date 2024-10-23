package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return Math.pow(0.5, n) + geometricSum(n-1);
		}
		
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius <= radiusMinimumDrawingThreshold) {
			return;
		} else {
			StdDraw.circle(xCenter, yCenter, radius);
			
			double leftxCenter = xCenter - radius;
			double leftyCenter = yCenter - radius;
			
			double rightxCenter = xCenter + radius;
			double rightyCenter = yCenter + radius;
			
			radius = radius/3;
			
			circlesUponCircles(leftxCenter, yCenter, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, leftyCenter, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(rightxCenter, yCenter, radius, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, rightyCenter, radius, radiusMinimumDrawingThreshold);
			
		}
		
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] copy = Arrays.copyOf(array, array.length);
		
		int i = 0;
		
		return helperReverse(copy, i);
				
		
	}
	
	public static int[] helperReverse(int[] array, int index) {
		if(index == (int)(array.length/2)) {
			return array;
		} else {
			int temp = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = temp;
			return helperReverse(array, index + 1);
		}		
		
			
		
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
