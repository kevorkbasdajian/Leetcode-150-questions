package removeDuplicatesFromSortedArrayII;
import java.util.Scanner;
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
		

	public static int removeDuplicates(int [] nums) {
		int j=0;
		for (int i=0;i<nums.length;i++) {
			int temp = 0;

			for(int ii=i+1; ii<nums.length && nums[ii] == nums[i]  ;ii++) {
				temp = ii;
			}
			if(temp>i+1) {
				nums[j]=nums[i];
				nums[j+1] = nums[i];
                j+=2;
				i = temp;
			}
			else{
                nums[j++] = nums[i];
                if(temp == (i+1)){
                    nums[j++] = nums[i++];
                }
            }
			}
		return j;
	}

}
