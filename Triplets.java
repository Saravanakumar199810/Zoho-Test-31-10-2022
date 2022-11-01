package zohoTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triplets {

	public static void main(String[] args) {
		int[] arr = {0,-1,5,-3,-2,-1};
		List<List<Integer>> ansList = new ArrayList<>();
		List<Integer> list;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						list = new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						Collections.sort(list);
						if(!ansList.contains(list)) {
							ansList.add(list);
						}
					}
				}
			}
		}
		System.out.println(ansList);
	}

}
