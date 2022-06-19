public class Abstract {
  public static void main(String[] args) {
    // Car c = new Car();
    // c.start();
    Audi a = new Audi();
    a.start();
  }
}

class Audi extends Car {
  void start() {
    System.out.println("Audi Car");
  }
}

class BMW extends Car {
  void start() {
    System.out.println("BMW Car");
  }
}

abstract class Car {
  String brand;
  int price;

  abstract void start();
}
