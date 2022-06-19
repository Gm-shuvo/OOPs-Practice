package encapsulation;

public class Encapsulations {
  public static void main (String[]args) {
    Laptop lap = new Laptop();
    lap.setPrice(3000);
    System.out.println(lap.getPrice());
  }

  // if public then anyone can access, void can be accessed by children, protected
  // can be access children, private none one unless parent
  public void dowork() {
    System.out.println("walking walking....");
  }

}

class Laptop {
  int ram;
  int price;

  public void setPrice(int p) {
    this.price = p;
  }

  public int getPrice() {
    return price;
  }
}
