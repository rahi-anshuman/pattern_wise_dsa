package TwoPointerandFastAndSlowPointer;

public class RemoveDuplicateFromSortedArray {
	

	private static int removeDuplicates(int arr[]) {
		int start = 0;
//		{0,0,1,1,1,2,2,3,3,4}
		for(int j=1;j<arr.length;) {
			if(arr[j]==arr[j-1]) {
				j++;
			}
			else {
				arr[++start]=arr[j];
				j++;
			}
		}
		return start+1;
	}
	
	private static int removeDuplicatesSecondWay(int arr[]) {
		int start = 0;
//		{0,0,1,1,1,2,2,3,3,4}
		for(int j=1;j<arr.length;j++) {
			if(!(arr[j]==arr[j-1])) {
				arr[++start]=arr[j];
			}
			
		}
		return start+1;
	}
	
	private static void printRes(int arr[], int length) {
		System.out.print("Unique array = { ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		int arr[]= {1,1,2};
		printRes(arr, removeDuplicates(arr));
		
		int arr2[]= {0,0,1,1,1,2,2,3,3,4};
		printRes(arr2, removeDuplicates(arr2));
		
		
		
	}

}
