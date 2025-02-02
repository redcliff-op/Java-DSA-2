public class CheckIfArrayIsSortedAndRotated {
  public boolean check(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        if (nums[0] < nums[len - 1]) {
          return false;
        }
        for (int j = i + 1; j < len - 1; j++) {
          if (nums[j] > nums[j + 1]) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
