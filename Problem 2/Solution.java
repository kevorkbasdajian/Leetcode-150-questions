package RemoveELement;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int nums1[]=new int[length];
		for(int i=0;i<length;i++) {
			nums1[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		int k=removeElement(nums1,val);
		System.out.println(k);

	}
	public static int removeElement(int[] nums, int val) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				int temp=0;
				for(int j=nums.length-1;j>=0;j--) {
					if(j==i) {
						temp=-1;
						break;
					}
					if(nums[j]!=val) {
						temp=j;
						break;
					}
				}
				if(temp==-1) {
					break;
				}
				int t = nums[temp];
				nums[temp]=nums[i];
				nums[i]=t;
				
			}
			
			
		}
		int k=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=val) {
        		k++;
        	}
        }
        return k;
		
    }

}
