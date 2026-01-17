package H_index;
import java.util.Scanner;

public class H_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int n = sc.nextInt();
		int citations[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter element "+(i+1)+" .");
			citations[i] = sc.nextInt();
		}
		int output = hIndex(citations);
		System.out.println("The output is: "+output);

	}
	public static int hIndex(int citations[]) {
		int h = -1;
        int true_h=0;
        for(int i=0;i<citations.length;i++){
            h=i+1;
            int temp=0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=h){
                    temp++;
                }
                if(temp==h){
                    break;
                }
            }
            if (temp==h){
                true_h=h;
            }
        }
        return true_h;
	}

}
