import java.util.HashSet;

public class ContainsDuplicate {

  // Using HashSet

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> temp = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (temp.contains(nums[i])) {
        return true;
      } else {
        temp.add(nums[i]);
      }
    }
    return false;
  }

  // Using Array Manipulation ( Can be used only if no element of array is greater than its length -1 )

  public static boolean containsDuplicate2(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      nums[nums[i] % len] += len;
    }
    for (int i = 0; i < len; i++) {
      if (nums[i] / len >= 2) {
        return true;
      }
    }
    return false;
  }
}
