public class RemoveDuplicatesFromSortedArray {
  public static int removeDuplicates(int[] nums) {
    int k = 1;
    int len = nums.length;
    for (int i = 1; i < len; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}
