package lab6;

import java.awt.Color;

import sedgewick.StdDraw;


public class Triangles {
/**
 * 
 * @param x1 point x1
 * @param y1 point y1
 * @param x2 point x2
 * @param y2 point y2
 * @param x3 point x3
 * @param y3 point y3
 * @param xArray[] values that go in polygon
 * @param yArray[] values that go in polygon
 * @param size is the distance from 0 to 1
 */
	public static void triangle(double x1, double y1, double x2, double y2, double x3, double y3, double size){
		if (size < .05){
			return;
		}
		double[] xArray = {x1,x2,x3};
		double[] yArray = {y1,y2,y3};
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledPolygon(xArray,yArray);
		triangle(x1,y1+size/2,x2+size/8,y2+size/4,x3-size/8,y3+size/4,size/2);
		triangle(x1-size/4,y1,x2-size/8,y2-size/4,x3-size*3/8,y3-size/4,size/2);
		triangle(x1+size/4,y1,x2+size*3/8,y2-size/4,x3+size*1/8,y3-size/4,size/2);
		
	}
	/**
	 * @param xA[] is original triangle x coordinates
	 * @param yA[] is original triangle y coordinates
	 */
	public static void main(String[] args) {
		double xA [] = {0,.5,1};
		double yA [] = {0,1,0};
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledPolygon(xA,yA);
		triangle(.5,0,.25,.5,.75,.5,1);
		StdDraw.show(10); 

	}

}

