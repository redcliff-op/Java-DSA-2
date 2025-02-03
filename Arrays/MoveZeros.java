public class MoveZeros {
  public void moveZeroes(int[] nums) {
    int len = nums.length;
    int l = 0;
    int r = 1;
    while (r < len) {
      if (nums[l] == 0 && nums[r] != 0) {
        nums[l] = nums[r];
        nums[r] = 0;
        l++;
        r++;
      } else if (nums[l] != 0 && nums[r] != 0) {
        l++;
        r++;
      } else if (nums[l] != 0 && nums[r] == 0) {
        r++;
      } else if (nums[l] == 0 && nums[r] == 0) {
        r++;
      }
    }
  }
}
