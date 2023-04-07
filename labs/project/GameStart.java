package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
/**
 * This is the GameStart class that kicks of the main and creates all objects for Coordinates and Level
 */
		
public class GameStart{

/**
 * Main that kicks off the program and takes in the inputs
 * @param boolean turnchoice keeps track of who's turn it is, this is passed throughout the objects
 * @param double gravity is the gravity that is inputed at the beginning of the game
 * @param double[] getCoorBigBallPowerup these are randomly generated coordinates for one of the powerups
 * @param double[] getCoorLargerBallPowerup these are randomly generated coordinates for one of the powerups
 * @param double[] getCoorSmallBallPowerup these are randomly generated coordinates for one of the powerups
 * @param double velocity is the speed of the throw that is inputed by the user
 * @param double angle is the angle of the throw that is inputed by the user
 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		boolean turnChoice = false;
		String yes = ap.nextString("Are you ready to play?");  // Input to start the game and creates a sound, doesn't allow you to enter no, you have to play
		if(!yes.equals("yes")){System.out.println("We heard yes!");}
		StdAudio.play("music/start_game.wav");
		
		String turn = ap.nextString("What color do you want to be? \n                   red (default) or blue");  //Turn choice based off ball color
		if(turn.equals("red")){turnChoice=true;}
		else if(turn.equals("blue")){turnChoice=false;}
		else{turnChoice = true;}
		
		double gravity = ap.nextDouble("Please enter a level of gravity? \n                   1 - 10");//Enter level of gravity
		
		//Draw level and players initially and creates objects
		Coordinates.drawLevelPlayer();
		Coordinates start = new Coordinates(.04, .96, .25);
		double[] getCoorBigBallPowerup = Coordinates.getCoorBigBallPowerup(start);
		double[] getCoorLargerBallPowerup = Coordinates.getCoorLargerBallPowerup(start);
		double[] getCoorSmallBallPowerup = Coordinates.getCoorSmallBallPowerup(start);
		Coordinates.drawBigBallPowerup(getCoorBigBallPowerup);
		Coordinates.drawLargerBallPowerup(getCoorLargerBallPowerup);
		Coordinates.drawSmallBallPowerup(getCoorSmallBallPowerup);
		Level thrownOne = new Level(.0, .0, 0.002, 0, .05,.07, .95);
		Level thrownTwo = new Level(.0, .0, 0.002, 0, .05,.07, .95);
		
		//Kicks off the game, I allow the users two chances to hit powerups and account for wind till it is randomly changed
		while(true){
			double dragCof = Level.getDrag();  // generates new wind speed
			
			Coordinates.drawBigBallPowerup(getCoorBigBallPowerup);
			Coordinates.drawLargerBallPowerup(getCoorLargerBallPowerup);
			Coordinates.drawSmallBallPowerup(getCoorSmallBallPowerup);
			double velocity = ap.nextDouble("Please enter the velocity of throw? \n                    0.0 - 100");
			if(velocity < 0){velocity = Math.abs(velocity);}
			double angle = ap.nextDouble("Please enter the angle of throw? \n                    0 - 90");
			Level.bannanaThrow(turnChoice, velocity, angle, gravity, dragCof, getCoorBigBallPowerup, getCoorLargerBallPowerup, getCoorSmallBallPowerup, thrownOne, thrownTwo);
			velocity = ap.nextDouble("Please enter the velocity of throw? \n                    0.0 - 100");
			if(velocity < 0){velocity = Math.abs(velocity);}
			angle = ap.nextDouble("Please enter the angle of throw? \n                    0 - 90");
			Level.bannanaThrow(!turnChoice, velocity, angle, gravity, dragCof, getCoorBigBallPowerup, getCoorLargerBallPowerup, getCoorSmallBallPowerup,  thrownOne, thrownTwo);
			
			getCoorBigBallPowerup = Coordinates.getCoorBigBallPowerup(start);  //Generates new posistions for the powerups
			getCoorLargerBallPowerup = Coordinates.getCoorLargerBallPowerup(start);
			getCoorSmallBallPowerup = Coordinates.getCoorSmallBallPowerup(start);
		}
	}
}



