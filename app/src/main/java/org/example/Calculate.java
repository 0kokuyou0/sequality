package org.example;

public class Calculate {
  public int Sum(int x, int y) {
    return x + y;
  }

  public double Ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int SumAtoB(int x, int y) {
    int sum = 0;
    for (int i = x; i < y + 1; i++) {
      sum = this.Sum((int) sum, i);
    }
    return sum;
  }

  public double AveAtoB(int x, int y) {
    int sum = 0;
    for (int i = x; i < y + 1; i++) {
      sum = this.Sum((int) sum, i);
    }
    return (double) sum / (y - x + 1);
  }

  public int OddAtoB(int x, int y) {
    int odd = 0;
    for (int i = x; i < y + 1; i++) {
      if (i % 2 == 1) {
        odd = this.Sum(odd, i);
      }
    }
    return odd;
  }

  public int EvenAtoB(int x, int y) {
    int even = 0;
    for (int i = x; i < y + 1; i++) {
      if (i % 2 == 0) {
        even = this.Sum(even, i);
      }
    }
    return even;
  }




}
