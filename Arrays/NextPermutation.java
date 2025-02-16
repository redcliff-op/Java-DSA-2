public class NextPermutation {
  public void nextPermutation(int[] nums) {
    int pivotIndex = -1;
    int len = nums.length;
    for (int i = len - 1; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        pivotIndex = i - 1;
        break;
      }
    }
    if (pivotIndex == -1) {
      int left = 0, right = len - 1;
      while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
      }
      return;
    }
    for (int i = len - 1; i > pivotIndex; i--) {
      if (nums[i] > nums[pivotIndex]) {
        int temp = nums[i];
        nums[i] = nums[pivotIndex];
        nums[pivotIndex] = temp;
        break;
      }
    }
    int left = pivotIndex + 1, right = len - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}
