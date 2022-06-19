public class Interface implements Cars,Walk{
  public static void main(String[] args) {
    Interface i = new Interface();
    i.start();
    i.walk();

  }

  public void start() {
    System.out.println("Car strating");
  }

  public void walk() {
    System.out.println("walk starting....");
  }


}

interface Cars {
  void start();
}

interface Walk {
  void walk();
}