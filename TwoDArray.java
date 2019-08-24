
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoD = new int[3][4]; //two dimentional array creation 
		int[][] n = {{2,3,4,5},{3,5,4},{4,5}}; //2D array initialization,  Jagged array
		System.out.println("size of twoD "+twoD.length);
		System.out.println("size of n "+n.length);
		for(int i= 0;i<twoD.length;i++) {
			System.out.println("size of twoD["+i+"]: "+twoD[i].length);
		}
		for(int i= 0;i<n.length;i++) {
			System.out.println("size of n["+i+"]: "+n[i].length);
		}
		for(int i=0;i<n.length;i++) {
			for(int x:n[i]) {
				System.out.print(x+"\t");
			}
			System.out.println();
			
		

	}
	}
}
