package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int numberOfBalls = ap.nextInt("Enter the number of balls");
		int numberOfCycles = ap.nextInt("Enter the number of cycles");
		double[][] ballStart = new double [numberOfBalls][2];
		double[][] ballVelocity = new double [numberOfBalls][2];
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		double radius = 0.04;
		for(int i = 0; i < numberOfBalls; ++i){
			ballStart[i][0] = Math.random();
			ballStart[i][1] = Math.random();
			ballVelocity[i][0] = (Math.random() * .009);
			ballVelocity[i][1] = (Math.random() * .009);
		}
		for(int c = 0; c < numberOfCycles; ++c){ 
			StdDraw.clear();

			for(int i = 0; i < numberOfBalls; ++i){
				for(int j = i + 1; j < numberOfBalls; ++j){ //this will increment the array so it brings up the location of the next ball
					double distX = (ballStart[i][0] - ballStart[j][0]) + ballVelocity[i][0];  
					double distY = (ballStart[i][1] - ballStart[j][1]) + ballVelocity[i][1];
					double distanceBetweenDT = Math.hypot(distX, distY); //distance between first and second ball
					double radiiT = 2.2 * radius; // 2 times the radius is the radii, distance between the two radii
					if(distanceBetweenDT <= radiiT){
						ballVelocity[i][0] = ballVelocity[i][0] * -1; //reverse velocity it above statement is true
						ballVelocity[i][1] = ballVelocity[i][1] * -1;
					}
				}
				// radius
				// bounce off wall according to law of elastic collision
				if (Math.abs(ballStart[i][0] + ballVelocity[i][0]) > 1.0 - radius) ballVelocity[i][0] = ballVelocity[i][0] * -1;
				if (Math.abs(ballStart[i][1] + ballVelocity[i][1]) > 1.0 - radius) ballVelocity[i][1] = ballVelocity[i][1] * -1;
				// update position
				ballStart[i][0] = ballStart[i][0] + ballVelocity[i][0]; 
				ballStart[i][1] = ballStart[i][1] + ballVelocity[i][1]; 
				// draw ball on the screen
				StdDraw.setPenColor(StdDraw.BLUE);  // draw ball
				StdDraw.filledCircle(ballStart[i][0], ballStart[i][1], radius); 
			}
			StdDraw.show(1); 
		}
	}
}
