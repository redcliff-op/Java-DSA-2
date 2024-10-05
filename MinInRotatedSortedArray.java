public class MinInRotatedSortedArray {

  // Smart Linear Search ( Gets 100% on Leetcode )

  public int findMin(int[] nums) {
    int min = nums[0];
    int len = nums.length;
    for(int i=0;i<len-1;i++){
      if(nums[i]>nums[i+1]){
        min = nums[i+1];
        break;
      }
    }
    return min;
  }

  // Smart Binary Search ( theoretically faster but same on leetcode )

  public int findMin2(int[] nums) {
    int len = nums.length;
    int left = 0, right = len-1, mid;
    int res = nums[0];
    while (left <= right){
      if(nums[left]<nums[right]){
        res = Integer.min(res,nums[left]);
        break;
      }
      mid = (left+right)/2;
      res = Integer.min(res,nums[mid]);
      if(nums[mid]>=nums[left]){
        left = mid+1;
      }else{
        right = mid-1;
      }
    }
    return res;
  }
}
