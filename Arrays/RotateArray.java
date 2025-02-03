public class RotateArray {
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    if (len < 2 || k == 0) {
      return;
    }
    k = k % len;
    int newArray[] = new int[len];
    int j = 0;
    for (int i = len - k; i < len; i++) {
      newArray[j++] = nums[i];
    }
    for (int i = 0; i < len - k; i++) {
      newArray[j++] = nums[i];
    }
    for (int i = 0; i < len; i++) {
      nums[i] = newArray[i];
    }
  }
}
