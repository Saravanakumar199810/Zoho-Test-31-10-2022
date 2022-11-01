package zohoTest2;

public class Knight {

	public static void main(String[] args) {
		int n=3,row=0,col=0,k=2;
		double ans = calculateProbability(n-1,row,col,k,0);
		System.out.println(ans);
	}

	private static double calculateProbability(int n, int row, int col, int k, int move) {
		double count=0;
		if(row < 0 || row > n || col < 0 || col > n)
			return 0;
		
		if(k==move) 
			return 1;
		
		count+=calculateProbability(n, row-2, col-1, k, move+1);
		count+=calculateProbability(n, row-2, col+1, k, move+1);
		count+=calculateProbability(n, row-1, col-2, k, move+1);
		count+=calculateProbability(n, row-1, col+2, k, move+1);
		count+=calculateProbability(n, row+1, col+2, k, move+1);
		count+=calculateProbability(n, row+1, col-2, k, move+1);
		count+=calculateProbability(n, row+2, col-1, k, move+1);
		count+=calculateProbability(n, row+2, col+1, k, move+1);
		
		return count/8;
	}

}
