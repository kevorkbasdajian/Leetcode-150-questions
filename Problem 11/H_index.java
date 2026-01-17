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
	public int hIndex(int[] citations) {
        for(int i=0;i<citations.length;i++){
            for(int j=0;j<citations.length-i-1;j++){
                if(citations[j]<citations[j+1]){
                    int temp = citations[j];
                    citations[j]=citations[j+1];
                    citations[j+1]=temp;
                }
            }
        }
    
        int current_max=citations[0];
        int h=0;
        if(current_max!=0){
            h=1;
        }
        for(int i=1;i<citations.length;i++){
            if(citations[i]<current_max){
                current_max=citations[i];
            }
            if(h<current_max){
                h++;
            }
            else{
                break;
            }
        }
        return h;
    }

}
