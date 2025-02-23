import java.util.Arrays;

public class LongestConsecutiveSequence {

  // By Sorting

  public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int maxLength = 0;
    int count = 1;
    int len = nums.length;
    if(len==0){
      return 0;
    }
    for(int i = 0;i<len-1;i++){
      if(nums[i]==nums[i+1]){
        continue;
      }else if(nums[i]==nums[i+1]-1){
        count++;
      }else{
        maxLength = Math.max(count, maxLength);
        count = 1;
      }
    }
    return Math.max(maxLength, count);
  }
}
