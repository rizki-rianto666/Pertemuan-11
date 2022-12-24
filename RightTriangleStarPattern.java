public class RightTriangleStarPattern {
	public static void StarRightTriangle(int n){
		int a, b;
		for (a = 0; a < n; a++) { // outer loop to handle number of rows
			for (b = 0; b <= a; b++) { // inner loop
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	// Driver Function
	public static void main(String args[]){
	int k = 4;
	StarRightTriangle(k);
	}

}
