package TwoPointerandFastAndSlowPointer;

public class SquareOfASortedArray {
//	[-11,-1,0,3,10]
	private static int[] squareSortedArray(int arr[]) {
		
		int start =0 ;
		int end = arr.length-1;
		while(start<=end) {
			if(arr[start]*arr[start]> arr[end]*arr[end]) {
				int temp = arr[end];
				arr[end]=arr[start]*arr[start];
				arr[start]=temp;
				
			}
			else {
				arr[end]=arr[end]*arr[end];
				
			}
			end--;
		}
		return arr;
	}
	
	private static void printRes(int arr[]) {
		System.out.print("result = { ");
		for(Integer element : arr) {
			System.out.print(element+" ,");
		}
		System.out.println(" }");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-4,-1,0,3,10};
		printRes(squareSortedArray(arr));
		
		int arr2[]= {-7,-3,2,3,11};
		printRes(squareSortedArray(arr2));
		
		int arr3[] = {-5,-3,-2,-1};
		printRes(squareSortedArray(arr3));

	}

}
