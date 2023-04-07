package mousefollower;

import sedgewick.StdDraw;

public class FollowTheMouse {

	public static double[] getMousePosition(){
		double [] mousePosition = new double[2];
		mousePosition[0] = StdDraw.mouseX();
		mousePosition[1] = StdDraw.mouseY();
		return mousePosition;
	}

	public static void drawBall(double[] position, double radius){
		double xCord = position[0];
		double yCord = position[1];
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(xCord, yCord, radius);
	}

	public static double[] changePosition(double[] position, double[] mousePosition, double speed){
		double [] changePosition = new double[2];
		changePosition[0] = (mousePosition[0] + position[0])*speed;
		changePosition[1] = (mousePosition[1] + position[1])*speed;
		return changePosition;
	}

	public static void main(String[] args) {
		double [] startPosition = {.01,.01};
		StdDraw.setCanvasSize();
		while(true){
			StdDraw.clear();
			drawBall(changePosition(startPosition,getMousePosition(),.5),.01);
			startPosition = changePosition(getMousePosition(),getMousePosition(),.5);
			StdDraw.show(10); 
			System.out.println(startPosition[0]+ " " + startPosition[1]);
			//StdDraw.pause(1000);
		}
	}

}
