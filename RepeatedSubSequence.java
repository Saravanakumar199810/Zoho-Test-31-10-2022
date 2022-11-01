package zohoTest2;

import java.util.HashSet;
import java.util.Set;

public class RepeatedSubSequence {
	
	static Set<String> res;
	String subsequence = "";

	public static void main(String[] args) {
		
		//String str = "XYBYAXBY";
		String str = "XBXAXB";
		RepeatedSubSequence repeated = new RepeatedSubSequence();
		res = new HashSet<>();
		
		repeated.generateSubsequence(str, 0);
		System.out.println(res);
		System.out.println(res.size());
		
	}

	private void generateSubsequence(String str, int index) {
		if(subsequence.length()>1) {
			containgsSubSequence(subsequence, str.substring(index-1));
		}
		for(int i=index;i<str.length();i++) {
			subsequence+=str.charAt(i);
			generateSubsequence(str,i+1);
			subsequence=subsequence.substring(0,subsequence.length()-1);
		}
		
	}

	private void containgsSubSequence(String subseq, String str) {
		int index=-1;
		boolean contains=true;
		if(subseq.length()>str.length()) {
			return;
		}
		for(int i=0;i<subseq.length();i++) {
			str=str.substring(index+1);
			index=str.indexOf(subseq.charAt(i));
			if(index==-1) {
				contains=false;
				break;
			}
		}
		if(contains) {
			res.add(subseq);
		}
	}
	

}