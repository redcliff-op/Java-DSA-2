class Pair<K, V> {
  private final K key;
  private final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

public class MinMax {

  public Pair<Long, Long> getMinMax(int[] arr) {
    Integer min = Integer.MAX_VALUE;
    Integer max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
      if(arr[i]<min){
        min = arr[i];
      }
    }
    return new Pair(Long.valueOf(min), Long.valueOf(max));
  }
}