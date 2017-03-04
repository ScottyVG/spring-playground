public class Person {

  // We can create instance level variables.
  // These can be used anywhere in the class.
  public String first;
  public String last;

  // Constructor Method.
  // We invoke this using the new keyword to instantiate an object.
  // It does not need a return type.
  public Person(String first, String last) {
    // since the instance variable `first`
    // "shadows" the parameter `first`, you need to use `this.first`
    this.first = first;
    this.last = last;
  }

  // the `fullName` method is added inside the class definition
  // NOTE that you do not need `this` here (but it is recommended practice)
  public String fullName() {
    return first + " " + last;
  }

  // we can use the main method to test our class
  public static void main(String[] args){

    // create a variable of type Person
    // invoke the constructo to instantiate / create a new Person object.
    Person rambo = new Person("Sylvester", "Stallone");

    // invoke the method on Rambo
    rambo.fullName();

  }

}
