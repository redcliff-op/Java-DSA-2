public class MaxSubArray {
  public static int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int cursum = 0;
    for (int i = 0; i < nums.length; i++) {
      cursum += nums[i];
      max = Integer.max(max, cursum);
      if (cursum < 0) {
        cursum = 0;
      }
    }
    return max;
  }
}
