package project;

import java.awt.Color;

import sedgewick.StdAudio;
import sedgewick.StdDraw;
/**

 *4-27-2017
 *Coordinates has three implemented methods for bounds of the screen
 */
public class Coordinates implements Position{
	
	private double leftBound;
	private double rightTopBound;
	private double bottomBound;
/**
 * @param leftBound is left boundary of the game screeen
 * @param rightTopBound is the right a top boundary of the game screen
 * @param bottomBound is the bottom boundary of the game screen
 */
	public Coordinates(double leftBound, double rightTopBound, double bottomBound) {

		this.leftBound = leftBound;
		this.rightTopBound = rightTopBound;
		this.bottomBound = bottomBound;
	}
	/**
	 * @returns the leftBound of the screen
	 */
	@Override
	public double getLeftBound() {
		return leftBound;
	}
	/**
	 * @returns the right and top bound of the screen
	 */
	@Override
	public double getRightTopBound() {
		return rightTopBound;
	}
	/**
	 * @returns the bottombound of the screen
	 */
	@Override
	public double getBottomBound() {
		return bottomBound;
	}
	/**
	 * randomly generates the coordinates for a powerup
	 * @param start object that passes is which gets the bounds to draw the powerup
	 * @return the coordinates for the powerup
	 */
	public static double[] getCoorBigBallPowerup(Coordinates start){
		double[] bigBallArray = new double[2];
		bigBallArray[0] = Math.random();
		while(bigBallArray[0] <  start.getLeftBound() || bigBallArray[0] > start.getRightTopBound()){bigBallArray[0] = Math.random();}	//Check to make sure powerup is not off screen
		bigBallArray[1] = Math.random();
		while(bigBallArray[1] < start.getBottomBound() || bigBallArray[1] > start.getRightTopBound()){bigBallArray[1] = Math.random();}  //Check to make sure powerup is not off screen	
		return bigBallArray;
	}
	/**
	 * randomly generates the coordinates for a powerup
	 * @param start object that passes is which gets the bounds to draw the powerup
	 * @return the coordinates for the powerup
	 */
	public static double[] getCoorLargerBallPowerup(Coordinates start){
		double[] largerSizeBallArray = new double[2];
		largerSizeBallArray[0] = Math.random();
		while(largerSizeBallArray[0] < start.getLeftBound()  || largerSizeBallArray[0] > start.getRightTopBound()){largerSizeBallArray[0] = Math.random();}  //Check to make sure powerup is not off screen	
		largerSizeBallArray[1] = Math.random();
		while(largerSizeBallArray[1] < start.getBottomBound() || largerSizeBallArray[1] > start.getRightTopBound()){largerSizeBallArray[1] = Math.random();}  //Check to make sure powerup is not off screen	
		return largerSizeBallArray;
	}
	/**
	 * randomly generates the coordinates for a powerup
	 * @param start object that passes is which gets the bounds to draw the powerup
	 * @return the coordinates for the powerup
	 */
	public static double[] getCoorSmallBallPowerup(Coordinates start){
		double[] smallBallPowerArray = new double[2];
		smallBallPowerArray[0] = Math.random();
		if(smallBallPowerArray[0] < start.getLeftBound()  || smallBallPowerArray[0] > start.getRightTopBound()){smallBallPowerArray[0] = Math.random();}  //Check to make sure powerup is not off screen	
		smallBallPowerArray[1] = Math.random();
		while(smallBallPowerArray[1] < start.getBottomBound() || smallBallPowerArray[1] > start.getRightTopBound()){smallBallPowerArray[1] = Math.random();}  //Check to make sure powerup is not off screen		
		return smallBallPowerArray;
	}
	/**
	 * Takes in the coorinates and draws the powerup on the screen
	 * @param bigBallArray the randomly generated coordinates that are used to draw the powerup
	 */
	public static void drawBigBallPowerup(double[] bigBallArray){
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledCircle(bigBallArray[0], bigBallArray[1], .03);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(bigBallArray[0], bigBallArray[1], "S+");		
		}
	/**
	 * Takes in the coorinates and draws the powerup on the screen
	 * @param bigBallArray the randomly generated coordinates that are used to draw the powerup
	 */
	public static void drawLargerBallPowerup(double[] largerSizeBallArray){
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(largerSizeBallArray[0], largerSizeBallArray[1], .03);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(largerSizeBallArray[0], largerSizeBallArray[1], "S++");		
	}
	/**
	 * Takes in the coorinates and draws the powerup on the screen
	 * @param bigBallArray the randomly generated coordinates that are used to draw the powerup
	 */
	public static void drawSmallBallPowerup(double[] smallBallArray){
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(smallBallArray[0], smallBallArray[1], .03);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(smallBallArray[0], smallBallArray[1], "-S");		
	}
	/**
	 * Draws the ground, ski and players
	 */
	public static void drawLevelPlayer(){
		//Draws the ski and stars
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledSquare(.5, .5, .5);
		for(int i = 0; i<100; ++i){
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledCircle(Math.random(), Math.random(), .005);
		}
		//Draws the ground
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.5,.025,.5,.025);
		
		//Draws the players
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.05, .07, .03);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(.95, .07, .03);
	}

}


