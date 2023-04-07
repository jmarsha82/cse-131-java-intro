package lab5;


public class Lab5Methods {
	/**
	
	 * Returns the sum of the postive integers n + (n-2) + (n-4)
	 * @param integer n
	 * @sum return value
	 */
	public static int sumDownBy2(int n){
		int sum = 0;
		if(n >= 2){
			for(int i = 0; i <= n; i += 2){
				sum += (n - i);
			}
		}
		else if(n == 1){sum = 1;}
		else{sum = 0;}
		return sum;
	}
	/**
	 * Returns the the sum 1 + 1/2 + 1/3 + .. + 1/(n-1) + 1/n
	 * @param integer n
	 * @sum return value
	 */
	public static double harmonicSum (int n){
		double sum = 0.0;
		if(n >= 0){
			for (int i = 1; i <= n; i++) {
				sum += 1.0 / i;
			}
		}
		else{sum = 0;}
		return sum;
	}
	/**
	 * Returns the the sum 1 + 1/2 + 1/4 + 1/8 + .. + 1/Math.pow(2,k)
	 * @param integer k
	 * @calcSum return value
	 */
	public static double geometricSum (int k){
		double calcSum = 0.0;
		int b = 2;
		if (k <= 0){k = 0;}
		for(int i = 0; i <= k; ++i){
			if(i == k){
				calcSum += 1 / (double) Math.pow(b, k);
			}
			else{
				calcSum += 1 / (double) Math.pow(b, i);
			}
		}
		return calcSum;
	}

	/**
	 * Returns the product j*k
	 * @param integer k, integer j
	 * @calcProduct return value
	 */
	public static int multPos (int j, int k){
		int calcProduct = 0;
		if (j == 0){j = 1;}	
		if (k == 0){k = 1;}
		for(int i = 0; i < j; ++i){
			calcProduct += k;
		}
		return calcProduct;
	}
	/**
	 * Returns the product j*k
	 * @param integer k that can be positive, negative or zero
	 * @param integer j that can be positive, negative or zero
	 * @param if the product is positive or negative
	 * @calcProduct return value
	 */
	public static int mult (int j, int k){
		int calcProduct = multPos(Math.abs(j),Math.abs(k));
		if(j == 0 || k == 0){calcProduct = 0;}
		else{
			int sign = (Math.abs(j)/j) * (Math.abs(k)/k);
			calcProduct = calcProduct * sign;
		}
		return calcProduct;
	}
	/**
	 * Returns the product n^k
	 * @param integer k that can be positive
	 * @param integer n that can be positive, negative or zero
	 * @calcProduct return value
	 */
	public static int expt (int n, int k){
		int calcProduct = n;
		if(k == 0){
			calcProduct = 1;
		}
		else if (k == 1){
			calcProduct = n;
		}
		else if (n == 0){
			calcProduct = 0;
		}
		else{
			for(int i = 2; i <= k; ++i){
				calcProduct = n * calcProduct;
			}
			if(k % k != 0){
				calcProduct = calcProduct * -1;
			}
		}
		return calcProduct;
	}
	public static void main(String[] args) {
		System.out.println(sumDownBy2(14));
		System.out.println(harmonicSum(14));
		System.out.println(multPos(-2,3));
		System.out.println(mult(-2,3));
		System.out.println(expt(-2,3));
	}
}
