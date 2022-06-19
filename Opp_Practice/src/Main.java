public class Main
{
  public static void main (String[]args)
  {
    Person p1 = new Person ();
      p1.age = 78;
      p1.name = "shuvo";
      System.out.println (p1.age + " " + p1.name);
      //method calling
      p1.doing();
      
      //constructor 
      Person p = new Person(34, "gm shuvo");
      
      System.out.println(p.age + " " + p.name);
      System.out.println(Person.count);
  }
}

class Person
{
  String name;
  int age;
  
  static int count;
  
  public Person(){
      count++;
      System.out.println("creating an Object");
  }
  
  public Person(int age, String name){
      //this(); //calling constructor in constructor
      this.name = name;
      this.age = age;
      
  }
  
  void doing(){
      System.out.println(name + " is walking");
  }
  
  void doing(int steps){
      System.out.println(name + " is walking" + steps);
  }

}