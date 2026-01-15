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
        for(int i=nums.length-1;i>0;){
            int bestcaseindex=0;
            int difference=0;
            for(int j=i-1;j>=0;j--){
                if(nums[j] >= (i-j)  && (i-j)>=difference){
                    bestcaseindex=j;
                    difference=i-j;
                }
            }
            i=bestcaseindex;
            counter++;
            
        }
        return counter;
	}

}
