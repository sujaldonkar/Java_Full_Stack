import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,5,4};
		
		for(int i: arr) {
			System.out.print(i);
		}
		
		Arrays.sort(arr);
		System.out.println("\nSorted order");
		for(int i: arr) {
			System.out.print(i);
		}
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		System.out.println("\nRemove duplicates");
		for(int i=0;i<=j;i++) {
			System.out.print(arr[i]);
		}
	}
}
