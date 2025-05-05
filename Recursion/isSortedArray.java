package Recursion;

public class isSortedArray {
  public boolean arraySortedOrNot(int[] arr) {
    return arraySortedOrNotHelper(arr, 0);
  }

  public boolean arraySortedOrNotHelper(int[] arr, int index) {
    if(index==arr.length-1){
      return true;
    }
    if(arr[index]>arr[index+1]){
      return false;
    }
    return arraySortedOrNotHelper(arr, index+1);
  }
}
