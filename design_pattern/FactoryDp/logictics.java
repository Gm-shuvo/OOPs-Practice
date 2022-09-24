public class logictics {
  public static void main(String[] args) {
    TransportFectory factory = new TransportFectory();
    Transport transportShip = factory.createTransport("ship");
    transportShip.deliver();
    Transport transportTruck = factory.createTransport("truck");
    transportTruck.deliver();
  }

}
