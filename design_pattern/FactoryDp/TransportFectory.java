public class TransportFectory {
  public Transport createTransport(String type) {
      if (type.equalsIgnoreCase("ship")) {
          return new Ship();
      } else if (type.equalsIgnoreCase("truck")) {
          return new Truck();
      } else {
          throw new IllegalArgumentException("Unknown transport type");
      }
    }
}
