package SingletonePattern;

public class client {
  public static void main(String[] args) {
    singleton s = singleton.getInstance();
    s.message();
  }
}
