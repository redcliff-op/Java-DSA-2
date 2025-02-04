public class RearrangeBySign {
  public int[] rearrangeArray(int[] nums) {
    int len = nums.length;
    int poPointer = 0;
    int nePointer = 0;
    int newArray[] = new int[len];
    int k = 0;
    while (true) {
      while (poPointer < len && nums[poPointer] < 0) {
        poPointer++;
      }
      while (nePointer < len && nums[nePointer] > 0) {
        nePointer++;
      }
      newArray[k++] = nums[poPointer++];
      newArray[k++] = nums[nePointer++];
      if (k == len) {
        break;
      }
    }
    return newArray;
  }

  // Faster but worse space complexity

  public int[] rearrangeArray2(int[] nums) {
    int len = nums.length;
    int negArray[] = new int[len / 2];
    int posArray[] = new int[len / 2];
    int finArray[] = new int[len];
    int nIndex = 0, pIndex = 0, fIndex = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] < 0) {
        negArray[nIndex++] = nums[i];
      } else {
        posArray[pIndex++] = nums[i];
      }
    }
    for (int i = 0; i < len / 2; i++) {
      finArray[fIndex++] = posArray[i];
      finArray[fIndex++] = negArray[i];
    }
    return finArray;
  }
}
