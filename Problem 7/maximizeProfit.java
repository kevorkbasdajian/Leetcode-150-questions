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
		int buyDay = prices[0];
		int profit = -1;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<buyDay) {
				buyDay = prices[i];
				continue;
			}
			if(prices[i]-buyDay > profit) {
				profit = prices[i] - buyDay;
			}
		}
		if(profit!=-1) {
			return profit;
		}
		return 0;
	}
	

}
