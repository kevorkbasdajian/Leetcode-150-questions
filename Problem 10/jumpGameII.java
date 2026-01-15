package jumpGameII;

import java.util.Scanner;

public class jumpGameII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element "+(i+1)+" .");
			nums[i] = sc.nextInt();
		}
		int result = jump(nums);
		System.out.println("The final result is "+result);

	}
	public static int jump(int nums[]) {
		int counter=0;
        int limit=nums[0];
        int farthest_range=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i==limit || i == nums.length-1){
                counter++;
                if(farthest_range<= (i+nums[i])){
                    farthest_range = i + nums[i];
                }
                limit=farthest_range;
            }
            if(farthest_range <= (i+nums[i])){
                farthest_range = i + nums[i];
            }
        }
        return counter;
    }
	}


