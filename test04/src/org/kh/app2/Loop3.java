package org.kh.app2;

public class Loop3 {

	public static void main(String[] args) {
     int[] nums = {80,95,75,60,100,65,70,90,85,95};
     for(int n : nums) {
    	 if(n>=80) System.out.println(n+"-->합격");
    	 else      System.out.println(n+"-->불합격");
     }//가장많이쓰는방법*가장중요*
	}

}
