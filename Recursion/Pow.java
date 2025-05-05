package Recursion;

public class Pow {
  public double myPow(double x, int n) {
    if (n <= 1) {
      return x;
    }
    return x * myPow(x, n - 1);
  }
}