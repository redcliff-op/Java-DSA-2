public class MaxProductSubarray {
  public static int maxProduct(int[] nums) {
    int maxProd = nums[0], minProd = nums[0], res = nums[0];
    int len = nums.length;
    for(int i=1;i<len;i++){
      int n = nums[i];
      if(n==0){
        maxProd = 1;
        minProd = 1;
        res = Math.max(0,res);
        continue;
      }
      int tempMaxProd = maxProd;
      maxProd = Math.max(n, Math.max(maxProd*n, n*minProd));
      minProd = Math.min(n, Math.min(tempMaxProd * n, n*minProd));
      res = Math.max(maxProd, res);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { -3, -1, -1 };
    System.out.println(maxProduct(arr));
  }
}
