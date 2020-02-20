package tasks;

public class CodingBat {
	
	public boolean only14(int[] nums) {
		for (int i=0; i<nums.length; i++) {
			if(nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}
	
	public boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if(nums[i] != nums[nums.length - len + i]) {
				return false;
			}
		}
		return true;
	}
	
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if(Math.abs(nums1[i] - nums2[i]) <=2 && nums1[i] != nums2[i]){
				count++;
			}
		}
		
		return count;
		
	}
	
	public int count7(int n) {
		if(n == 0) {
			return 0;
		}
		if(n % 10 == 7) {
			return 1 + count7(n / 10);
		}
		return count7(n / 10);
	}
	
	public boolean array220(int[] nums, int index) {
		if(index >= nums.length - 1) {
			return false;
		}
		//return nums[index] * 10 == nums[index+1] || array220(nums, index +1); 
		if(nums[index] * 10 == nums[index+1]) {
			return true;
		}
		return array220(nums, index +1);
		
	}
	
	
	
	
	
	
}
