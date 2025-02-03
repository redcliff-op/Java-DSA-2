public class MissingNumber {
  public int missingNumber(int[] nums) {
    int len = nums.length;
    int newArray[] = new int[len + 1];
    for (int i = 0; i < len; i++) {
      newArray[nums[i]] = 1;
    }
    for (int i = 0; i < len + 1; i++) {
      if (newArray[i] != 1) {
        return i;
      }
    }
    return -1;
  }
}
