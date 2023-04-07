package project;

import java.awt.Color;

import sedgewick.StdAudio;
import sedgewick.StdDraw;

public class Level implements Position{

	private double velocity;
	private double angle;
	private double drag;
	private int powerUp;
	private double leftBound;
	private double rightTopBound;
	private double bottomBound;
/**
 * 
 * @param velocity passed over from the main
 * @param angle passed over from the main
 * @param drag/wind is randomly generated at an appropriate level and is always against the ball, displayed on the screen
 * @param powerUp is the either 1,2,3 or nothing(0) depending on what the player hits
 * @param leftBound is the bound of the animation on the screen
 * @param rightTopBound is the bound of the animation on the screen
 * @param bottomBound is the bound of the animation on the screen
 */
	public Level(double velocity, double angle, double drag, int powerUp, double leftBound, double rightTopBound, double bottomBound) {
		this.velocity = velocity;
		this.angle = angle;
		this.drag = drag;
		this.powerUp = powerUp;
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
	 * @returns the stored powerup depending on the Level object name
	 */
	public int getPowerUp() {
		return powerUp;
	}
	/**
	 * sets the powerup based off what the user hits
	 * @param powerUp sets to this.powerup
	 */
	public void setPowerUp(int powerUp) {
		this.powerUp = powerUp;
	}
	/**
	 * Randomly generates wind drag on the ball
	 * @returns the drag on the ball caused by wind
	 */
	public static double getDrag() {
		double drag = ((Math.random() /10) / .15);
		return drag;
	}
	/**
	 * displays a game over animation and shows the winner of the game
	 * @param x is a starting x coordinate
	 * @param y is a starting y coordinate
	 * @param turn takes in whose turn it is when an opposing player is hit
	 */
	public void gameOver(boolean turn){
        double x = 0;
        double y = 1;
		String winner = "";
		if(turn == true){winner = "Red";}
		else{winner = "Blue";}
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.5, .5, 0.5);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.5, .5, 0.33);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.5, .5, 0.25);

        while (x<1){
            x = x + .1;
            y = y - .1;
            StdDraw.show(100);
    		StdDraw.setPenColor(Color.white);
    		StdDraw.text(x,y, winner + " Wins");

     }    
		StdAudio.play("music/enjoyable_game.wav");
		StdDraw.show(3000);
	}
	/**
	 * Determines if a player hits a powerup
	 * @param startXPosition is the X coordinate position of the player
	 * @param startYPosition is the Y coordinate position of the player
	 * @param bigBallLocation is an array of coordinates for the position of the powerup
	 * @param turn shows who turn it is
	 * @param thrownOne is a players object
	 * @param thrownTwo is the other players object
	 * @param powerUp is the powerup status when he hits the powerup
	 */
	public static void bigBallPowerup(double startXPosition, double startYPosition, double[] bigBallLocation, boolean turn, Level thrownOne, Level thrownTwo, int powerUp){
		double distX = 0.0;
		double distY = 0.0;
		double distanceBetweenDT = 0.0;
		double radius = .04;
		double radii = 0.0;
		if(powerUp==1){radius = .07;}  //Radius of the changing ball sizes
		if(powerUp==2){radius = .11;}
		if(powerUp==3){radius = .03;}
		if(turn==true){
			distX = (startXPosition - bigBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - bigBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownOne.setPowerUp(1); //Assigns powerup if it is hit
			}
		}
		else if(turn==true){
			thrownOne.setPowerUp(0);
		}

		else if(turn==false){
			distX = (startXPosition - bigBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - bigBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownTwo.setPowerUp(1); //Assigns powerup if it is hit
			}
		}
		else{
			thrownTwo.setPowerUp(0);
		}

	}
	/**
	 * Determines if a player hits a powerup
	 * @param startXPosition is the X coordinate position of the player
	 * @param startYPosition is the Y coordinate position of the player
	 * @param bigBallLocation is an array of coordinates for the position of the powerup
	 * @param turn shows who turn it is
	 * @param thrownOne is a players object
	 * @param thrownTwo is the other players object
	 * @param powerUp is the powerup status when he hits the powerup
	 */
	public static void largerBallPowerup(double startXPosition, double startYPosition, double[] largerBallLocation, boolean turn, Level thrownOne, Level thrownTwo, int powerUp){
		double distX = 0.0;
		double distY = 0.0;
		double distanceBetweenDT = 0.0;
		double radius = .04;
		double radii = 0.0;
		if(powerUp==1){radius = .07;}  //Radius of the changing ball sizes
		if(powerUp==2){radius = .11;}
		if(powerUp==3){radius = .03;}
		if(turn==true){
			distX = (startXPosition - largerBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - largerBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownOne.setPowerUp(2); //Assigns powerup if it is hit
			}
		}
		else if(turn==true){
			thrownOne.setPowerUp(0);
		}

		else if(turn==false){
			distX = (startXPosition - largerBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - largerBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownTwo.setPowerUp(2); //Assigns powerup if it is hit
			}
		}
		else{
			thrownTwo.setPowerUp(0);
		}

	}
	/**
	 * Determines if a player hits a powerup
	 * @param startXPosition is the X coordinate position of the player
	 * @param startYPosition is the Y coordinate position of the player
	 * @param bigBallLocation is an array of coordinates for the position of the powerup
	 * @param turn shows who turn it is
	 * @param thrownOne is a players object
	 * @param thrownTwo is the other players object
	 * @param powerUp is the powerup status when he hits the powerup
	 */
	public static void smallBallPowerup(double startXPosition, double startYPosition, double[] smallBallLocation, boolean turn, Level thrownOne, Level thrownTwo, int powerUp){
		double distX = 0.0;
		double distY = 0.0;
		double distanceBetweenDT = 0.0;
		double radius = .04;
		double radii = 0.0;
		if(powerUp==1){radius = .07;}  //Radius of the changing ball sizes
		if(powerUp==2){radius = .11;}
		if(powerUp==3){radius = .03;}
		if(turn==true){
			distX = (startXPosition - smallBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - smallBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownOne.setPowerUp(3); //Assigns powerup if it is hit
			}
		}
		else if(turn==true){
			thrownOne.setPowerUp(0);
		}

		else if(turn==false){
			distX = (startXPosition - smallBallLocation[0]); //determines the distance between the player ball and the powerup
			distY = (startYPosition - smallBallLocation[1]);
			distanceBetweenDT = Math.hypot(distX, distY);
			radii = 1.3 * radius;
			if(distanceBetweenDT <= radii){
				thrownTwo.setPowerUp(3); //Assigns powerup if it is hit
			}
		}
		else{
			thrownTwo.setPowerUp(0);
		}

	}
	/**
	 * Players one of five sounds randomly upon a collision with anything but the other player
	 */
	public void collionsDisplay(){
		int choice = (int) ((Math.random() *10) / 2);
		if(choice == 0){StdAudio.play("music/not_needed.wav");}
		else if(choice == 1){StdAudio.play("music/doh2.wav");}
		else if(choice == 2){StdAudio.play("music/dammit.wav");}
		else if(choice == 3){StdAudio.play("music/aw_crap.wav");}
		else{StdAudio.play("music/feeling_stupid.wav");}
	}
	/**
	 * Determines if there is a collision
	 * @param startXPosition x coordinate of the ball
	 * @param startYPosition y coordinate of the ball
	 */
	public void collision(double startXPosition, double startYPosition){
		if(startXPosition < 0.0|| startXPosition > 1.0 || startYPosition < 0.07){
			collionsDisplay();
		}
	}
	/**
	 * Determines if the other player is hit by the ball
	 * @param startXPosition x coordinate of the ball
	 * @param startYPosition y coordinate of the ball
	 * @param targetXPosition x coordinate of the other player
	 * @param targetYPosition y coordinate of the other player
	 * @param turn determines who is throwing the ball upon entry into the method
	 * @param powerUp determines if there is a powerup in affect to account for a change in a radius of the ball
	 * @return
	 */
	public boolean winCheck(double startXPosition, double startYPosition, double targetXPosition, double targetYPosition, boolean turn, int powerUp){
		boolean con = true;
		double distX = (startXPosition - targetXPosition); 
		double distY = (startYPosition - targetYPosition);
		double distanceBetweenDT = Math.hypot(distX, distY);
		double radius = .04;
		if(powerUp==1){radius = .07;}  //Radius of the changing ball sizes
		if(powerUp==2){radius = .11;}
		if(powerUp==3){radius = .03;}
		double radii = 1.3 * radius;
		if(distanceBetweenDT <= radii){
			gameOver(turn);  // kicks off game over animation
			con = false;
		}
		return con;
	}
	/**
	 * This is the running of the game
	 * @param turn determines who's turn it is
	 * @param velocity passes over the velocity from main
	 * @param angle passes over angle from main
	 * @param gravity passes over degree of gravity from main
	 * @param dragCof is the amount of drag caused by wind and is displayed on the screen
	 * @param getCoorBigBallPowerup coordinates of a powerup
	 * @param getCoorLargerBallPowerup coordinates of a powerup
	 * @param getCoorSmallBallPowerup coordinates of a powerup
	 * @param thrownOne object of the first player
	 * @param thrownTwo object of the second player
	 */
	public static void bannanaThrow(boolean turn, double velocity, double angle, double gravity, double dragCof, double[] getCoorBigBallPowerup,
			double[] getCoorLargerBallPowerup, double[] getCoorSmallBallPowerup, Level thrownOne, Level thrownTwo){
		int powerUp = 0;
		velocity = velocity/10;
		boolean con = true;
		double projectileRadius = 0.02;
		double gravCon = gravity;
		double radAngle = Math.toRadians(angle);
		double startXPosition;
		double startYPosition;
		double targetXPosition;
		double targetYPosition;
		
		//determines the start position and target position based off turn
		if(turn == true){
			startXPosition = thrownOne.getLeftBound();
			startYPosition = thrownOne.getRightTopBound();
			targetXPosition = thrownOne.getBottomBound();
			targetYPosition = thrownOne.getRightTopBound();
		}
		else{
			startXPosition = thrownTwo.getBottomBound();
			startYPosition = thrownTwo.getRightTopBound();	
			targetXPosition = thrownTwo.getLeftBound();
			targetYPosition = thrownTwo.getRightTopBound();
		}
		
		//Begins calculation of ball in movement that can be done outside the loop
		double ax = startXPosition;
		double ay = startYPosition;     
		double vx = velocity * Math.cos(radAngle);   // velocity in x direction
		double vy = velocity * Math.sin(radAngle);   // velocity in y direction
		
		//Starts ball in movement
		while (con == true && startYPosition >= 0.07 && startXPosition >=0.0 && startXPosition <= 1.0) {
			StdDraw.clear();
			
			//Checks to see if there is a powerup assigned to change the type of ball being thrown
			if(turn==true){
				powerUp = thrownOne.getPowerUp();
			}
			else{
				powerUp = thrownTwo.getPowerUp();
			}
			
			//Draws level and powerups every movement of the ball
			Coordinates.drawLevelPlayer();
			Coordinates.drawBigBallPowerup(getCoorBigBallPowerup);
			Coordinates.drawLargerBallPowerup(getCoorLargerBallPowerup);
			Coordinates.drawSmallBallPowerup(getCoorSmallBallPowerup);
			
			//Displays wind in a readable fashion on the screen
			StdDraw.setPenColor(Color.WHITE);
			String drag = Integer.toString((int) (dragCof * 100));
			StdDraw.text(.5, .95, "Wind: " + drag + "mph");
			
			//checks to see if a powerup is hit
			bigBallPowerup(startXPosition, startYPosition, getCoorBigBallPowerup, turn, thrownOne, thrownTwo,powerUp);
			largerBallPowerup(startXPosition, startYPosition, getCoorLargerBallPowerup, turn, thrownOne, thrownTwo,powerUp);
			smallBallPowerup(startXPosition, startYPosition, getCoorSmallBallPowerup, turn,thrownOne, thrownTwo,powerUp);
			
			// applies drag to velocity so it is constantly being reduced or else ball flys off screen if not contained in loop
			ax = -dragCof * velocity * vx;
			ay = -gravCon - dragCof * velocity * vy;
			vx += ax * 0.01;
			vy += ay * 0.01;
			
			//checks to see if a powerup is applied and changes radius of the ball
			if(powerUp==1){projectileRadius = .04;}
			if(powerUp==2){projectileRadius = .06;}
			if(powerUp==3){projectileRadius = .01;}
			if(turn==true){startXPosition += vx * 0.01;}
			else{startXPosition -= vx * 0.01;}
			startYPosition += vy * 0.01;
			
			//draws ball
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledCircle(startXPosition, startYPosition, projectileRadius);
			
			//Checks for a win then checks for a collision with a bound
			if(turn==true){
				con = thrownOne.winCheck(startXPosition, startYPosition,targetXPosition,targetYPosition,turn,powerUp);
				thrownOne.collision(startXPosition,startYPosition);
			}
			else{
				con = thrownTwo.winCheck(startXPosition, startYPosition,targetXPosition,targetYPosition,turn,powerUp);
				thrownTwo.collision(startXPosition,startYPosition);
			}
			StdDraw.show(10);
			StdDraw.pause(1);

		}
	}
}



