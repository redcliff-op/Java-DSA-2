public class LargestElementInArray{
  int largest(int arr[], int n) {
    int max = Integer.MIN_VALUE;
    int len = arr.length;
    for(int i=0;i<len;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    
  }
}