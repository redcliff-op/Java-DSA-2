public class SortedTwoSum {
  public int[] twoSum(int[] arr, int target) {
    int l = 0, r = arr.length - 1;
    int res[] = new int[2];
    while (l < r) {
      int sum = arr[l] + arr[r];
      if (sum < target) {
        l++;
      } else if (sum > target) {
        r--;
      } else {
        res[0] = l + 1;
        res[1] = r + 1;
        break;
      }
    }
    return res;
  }
}
