public class SortColors {
  public void sortColors(int[] nums) {
    int len = nums.length;
    int newArray[] = new int[len];
    int k = 0;
    for(int i=0;i<len;i++){
      if(nums[i]==0){
        newArray[k++] = nums[i];
      }
    }
    for (int i = 0; i < len; i++) {
      if (nums[i] == 1) {
        newArray[k++] = nums[i];
      }
    }
    for (int i = 0; i < len; i++) {
      if (nums[i] == 2) {
        newArray[k++] = nums[i];
      }
    }
    for (int i = 0; i < len; i++) {
      nums[i] = newArray[i];
    }
  }
}
