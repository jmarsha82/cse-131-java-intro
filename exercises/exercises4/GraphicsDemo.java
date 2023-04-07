package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(.5, .5);
		
		// larger green point
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(.05);
		StdDraw.point(.75, .5);
		// unfilled red triangle
		StdDraw.setPenRadius();
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(0, 1, .5, 0);
		StdDraw.line(.5, 0, 0, 0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.75, .75, .1);
		// filled blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.25, .75, .5, .25);
		


	}

}
