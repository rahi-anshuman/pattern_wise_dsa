package TwoPointerandFastAndSlowPointer;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

public class PairSum {
	
	private static int[] pairSum(int nums[], int target) {
		int res[] = {-1,-1};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.get(target-nums[i])!=null) {
				res[1]=i;
				res[0]= map.get(target-nums[i]);
				return res;
			}
			map.put(nums[i], i);
		}
		return res;
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
		int nums[] = {2,7,11,15};
		int target = 9;
		printRes(pairSum(nums, target));
		int nums2[] = {3,2,4};
		int target2 = 6;
		printRes(pairSum(nums2, target2));

	}

}
