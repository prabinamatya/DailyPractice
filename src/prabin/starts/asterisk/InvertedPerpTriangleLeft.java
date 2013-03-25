package prabin.starts.asterisk;

public class InvertedPerpTriangleLeft {
	
	public void makeLeftInvertedTriangle(int numb) {
		for(int i = numb; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void makeRightInvertedTriangle(int num) {
		int spaces = 0;
		for(int i = num; i >= 1; i--) {
			for(int k = 0; k < spaces; k++){
				System.out.print(" ");
			}
			for(int j = i; j >=1; j--) {
				System.out.print("*");
			}
			spaces++;
			System.out.println();
		}
	}

	public void makeInvertedPyramid(int num) {
		int spaces = 0;
		for(int i = num; i >= 0; i-=2) {
			for(int k = 0; k <= spaces; k++){
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			spaces++;
		}
	}
	
	public void upperLeftHypotenuseTriangle(int num) {
		for(int i =1; i <= num; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void upperRightHypotenuseTriangle(int num) {
		int spaces = num;
		for(int i = 1; i <= num; i++) {
			for(int k = spaces; k >= 0; k--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
	}
	
}
