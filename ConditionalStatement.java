public class ConditionalStatement {

  public static void main(String[] args) {
    int age = 7;
    boolean maleGender = true;
    double growth = 1.7;
    char f = 'K';
    if (age > 20) {
      System.out.println("Еще не поздно улыбаться");
    }
    if (maleGender) {
      System.out.println("Be sure to learn to dance");
    }
    if (!maleGender) {
      System.out.println("Chop wood");
    }
    if (growth < 1.8) {
      System.out.println("Play basketball");
    } else {
      System.out.println("Plant flowers");
    }
    if (f == 'M') {
      System.out.println("Make the bar");
    } else if (f == 'I') {
      System.out.println("Squat");
    } else {
      System.out.println("Get new knowledge every day");
    }
  }
}
