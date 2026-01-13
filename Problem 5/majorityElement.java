package majorityElement;
import java.util.Scanner;
public class majorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element " + (i+1) + ":");
			nums[i] = sc.nextInt();
		}
		int output = majorityElement(nums);
		if(output != -1) {
			System.out.println(output);

		}

	}
	public static int majorityElement(int nums[]) {
		for(int i=0;i<nums.length;i++) {
			int sum=1;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j] == nums[i]) {
					sum++;
				}
			}
			if(sum > (nums.length/2)) {
				return nums[i];
			}
		}
		return -1;
	}

}
