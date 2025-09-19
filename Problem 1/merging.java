package Merging2sortedarrays;
import java.util.Scanner;
public class merging {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension of the first array");
		int m =sc.nextInt();
		System.out.println("Enter the dimension of the second array");
		int n =sc.nextInt();
		
		int nums1[]= new int[m+n];
		int nums2[]= new int[n];
		
		for(int i=0;i<nums1.length;i++) {
			if(i> (m-1)) {
				nums1[i]=0;
			}
			else {
				System.out.println("Enter a number");
				nums1[i]=sc.nextInt();
			}

		}
		
		for(int i=0;i<nums2.length;i++) {
			System.out.println("Enter a number");
			nums2[i]=sc.nextInt();
		}
		
		merge(nums1,m,nums2,n);
		for(int i:nums1) {
			System.out.print(i+" ");
		}

	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a= (m-1);
        int b= (n-1);
        for(int a1=(nums1.length-1);a1>=0;a1--){
        	if(a<0) {
        		nums1[a1]=nums2[b--];
        	}
        	else if(b<0) {
        		nums1[a1]=nums1[a--];
        	}
        	
        	else if(nums1[a] > nums2[b]){
                nums1[a1]= nums1[a--];
            }
            else if (nums2[b]>=nums1[a]){
                nums1[a1]= nums2[b--];
            }
        }
    }

}
