package exercises6;

public class Add {

	//
	// Complete using the formula:
	//   add(x,y) =           x , if y == 0
	//   add(x,y) = add(x+1,y-1), otherwise
	//
	public static int addhelper(int x, int y) {
		if(y==0){
			return x;

		}
		else{
			return addhelper(x+1,y-1);
		}

	}
	public static int add(int x, int y){
		if (y<0){
			if(x<0){ //x is also negative
				return addhelper(-x,-y);
			}
			else{ // x>=0
				return addhelper(y,x);
			}
		}
		else{
			return addhelper(x,y);
		}
	}

	public static int addAny(int x, int y) {
		if (y >= 0)
			return add(x,y);
		else
			return 0; // FIXME
	}

}
