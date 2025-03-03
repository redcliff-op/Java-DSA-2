import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol3Sum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int len = nums.length;
    Arrays.sort(nums);
    int r = len - 1;
    for (int i = 0; i < len - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int l = i + 1;
      int sum = 0;
      while (l < r) {
        sum = nums[i] + nums[l] + nums[r];
        if (sum == 0) {
          res.add(Arrays.asList(nums[i], nums[l], nums[r]));
          while (l < r && nums[l] == nums[l + 1]) {
            l++;
          }
          l++;
          r--;
        } else if (sum < 0) {
          l++;
        } else {
          r--;
        }
      }
    }
    return res;
  }
}
