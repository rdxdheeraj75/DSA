package sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
		int t = 2;
		
		System.out.println(search(nums,t));
		
	}
	
	public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n-1;

        while(st <= end){

            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[st] == nums[mid] && nums[mid] == nums[end]){
                st = st+1;
                end = mid-1;
            }
            else{

                // left side sorted
                if(nums[st] <= nums[mid]){
                    if(nums[st] <= target && nums[mid] >= target){
                        end = mid-1;
                    }
                    else{
                        st = mid+1;
                    }
                }
                else{
                    // right side sorted
                    if(nums[mid] <= target && nums[end] >= target){
                        st = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }

            }

        }

        return false;
    }

}
