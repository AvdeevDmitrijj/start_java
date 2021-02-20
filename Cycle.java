public class Cycle {

  public static void main(String args[]) {
    for (int i = 0; i <= 20; i++) {
      System.out.println(i + " ");
    }

    int t = 6;
    while (t >= -6) {
      System.out.print(t + " ");
      System.out.println();
      t = t - 2;
    }

    int f = 9;
    int k = 0;
    do {
      f++;
      if (f % 2 != 0) {
        k += f;
      }
    } while (f < 20);
    System.out.print(k);
  }
}
