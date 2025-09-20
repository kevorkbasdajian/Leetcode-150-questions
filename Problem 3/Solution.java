package RemoveDuplicatesFromSortedArray;
import java.util.Scanner;
import java.util.HashMap;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int nums[] = new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter number " + (i+1));
			nums[i] = sc.nextInt();
		}
		int k = removeDuplicates(nums);
		System.out.println(k);
		

	}
		
	public static int removeDuplicates(int[] nums) {
        HashMap<Integer,Boolean> temp = new HashMap();
        int j=0;
        for(int i=0;i<nums.length;i++) {
        	if(temp.get(nums[i])==null) {
        		temp.put(nums[i], true);
        		nums[j]=nums[i];
        		j++;
        	}
        }
        return j;
    }

}
