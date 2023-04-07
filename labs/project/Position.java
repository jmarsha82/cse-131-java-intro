package project;

import java.awt.Color;

import sedgewick.StdDraw;
/**
 * This is the interface Position

 * 4-27-2017
 * This interface includes the below methods because bounds are needed in both methods to confirm the level and animation stay within screen and look correct
 */
public interface Position {
	
	public double getLeftBound();
	public double getRightTopBound();
	public double getBottomBound();
}
