public class SecondLargestWithoutSorting {
  public int getSecondLargest(int[] arr) {
    if (arr.length < 2) {
      return -1;
    }
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }
    if (secondMax == Integer.MIN_VALUE) {
      return -1;
    }
    return secondMax;
  }
}
