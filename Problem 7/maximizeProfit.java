package maxProfit;
import java.util.Scanner;
public class maximizeProfit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days.");
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter price on day "+(i+1)+" .");
			prices[i] = sc.nextInt();
		}
		int output = MaxProfit(prices);
		System.out.println("The maximum profit: " + output + " .");

	}
	public static int MaxProfit(int prices[]) {
		int greatestDifference = -1;
		for(int i=0;i<prices.length;i++) {
			int largest = -1;
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j] > prices[i] && prices[j] > largest) {
					largest = prices[j];
				}
			}
			if(largest !=-1) {
				if(largest-prices[i] > greatestDifference) {
					greatestDifference = largest-prices[i];
				}
			}
		}
		if(greatestDifference == -1)
			return 0;
		else
			return greatestDifference;
	}
	

}
