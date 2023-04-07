package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	/**
	 * 
	 * @param l length of the rectangle
	 * @param w width of the rectangle
	 */
	public Rectangle (int l, int w){
		this.length = l;
		this.width = w;
	}
	
	/**
	 * 
	 * @return the Area of the rectangle
	 */
	public int getArea (){
		return length*width;
	}
	
	public int getPerimeter (){
		return 2*length + 2*width;
	}
	
	public boolean compareRect (Rectangle x){
		int area1 = length*width;
		int area2 = x.getArea();
		
		if (area1 < area2){
			return true;
		}
		else return false;
	}
	
	public boolean isSquare (){
		if (length == width){
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
