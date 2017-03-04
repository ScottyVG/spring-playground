public class Rect {

  // We can create instance level variables.
  // These can be used anywhere in the class.
  public int width;
  public int length;

  // Constructor Method.
  // We invoke this using the new keyword to instantiate an object.
  // It does not need a return type.
  public Rect(int width, int length) {
    // since the instance variable `first`
    // "shadows" the parameter `first`, you need to use `this.first`
    this.width = width;
    this.length = length;
  }

  // the `fullName` method is added inside the class definition
  // NOTE that you do not need `this` here (but it is recommended practice)
  public int rectangle() {
    return width * length;
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
