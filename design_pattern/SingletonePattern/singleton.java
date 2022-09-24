package SingletonePattern;

public class singleton {
  private static singleton instance = new singleton();

  private singleton() {
  }

  public static singleton getInstance() {
    return instance;
  }

  public void message() {
    System.out.println("Hello World!");
  }
}