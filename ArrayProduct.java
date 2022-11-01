package zohoTest2;

import java.util.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int ans;
		int[] ansArray = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans=1;
			for(int j=0;j<arr.length;j++) {
				ans*=(i!=j)?arr[j]:1;
			}
			ansArray[i]=ans;
		}
		System.out.println(Arrays.toString(ansArray));

	}

}
