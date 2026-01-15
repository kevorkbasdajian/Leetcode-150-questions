package jumpGame;
import java.util.Scanner;

public class jumpGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element "+(i+1)+" .");
			nums[i] = sc.nextInt();
		}
		boolean result = canJump(nums);
		System.out.println("The final result is "+result);
	}
	public static boolean canJump(int nums[]) {
		boolean canjump=true;
        for(int i=nums.length-1;i>0;){
            canjump=false;
            for(int j=i-1;j>=0;j--){
                if(nums[j] - (i-j) >=0){
                    canjump=true;
                    i=j;
                    break;
                }
            }
            if(canjump==false){
                return false;
            }
        }
        return true;
	}

}
