package maxProfit_II;
import java.util.Scanner;
public class maximizeProfitII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days.");
		int n = sc.nextInt();
		int prices[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter price on day "+(i+1)+" .");
			prices[i] = sc.nextInt();
		}
		int output = maxProfit(prices);
		System.out.println("The maximum profit: " + output + " .");
	}
	public static int maxProfit(int[] prices) {
        int potential=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<=potential){
                potential = prices[i];
            }
            else if (prices[i] > potential){
                profit+=prices[i]-potential;
                potential=prices[i];
            }
        }
        return profit;
    }

}
