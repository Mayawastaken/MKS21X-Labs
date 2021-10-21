/* Make a Kitty class

    Write an appropriate Kitty class. Save the file in the same directory as the Driver file (01-Object).
    Fill in all the required methods, but leave the body blank (non-void methods need a temporary return value).
    Compile and run the driver with your "Blank" class.
    Compile and run each time you fill in a method!

What deos your Kitty class need?

By reading this main, you can see that the Kitty class requires:
2 fields:

    age - an integer representation
    name - any non-empty string.

2 constructors:

    a default [default constructor has no parameters] that makes a 2 year old cat Named "Mittens"
    and a (String,int) constructor that initializes the name/age with the parameters.

2 accessor methods:

    getName()
    getAge()

2 mutator methods:

    changeName(String) - changes the name to the provided argument.
    makeOlder() - add 1 to the age. */

public class Kitty{
  private String name;
  private int age;

  public Kitty(String startName, int startAge){
    name = startName;
    age = startAge;
  }

  public Kitty(){
    name = "Mittens";
    age = 2;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  public void makeOlder(){
    age++;
  }

  public void changeName(String newName){
    name = newName;
  }

  public String toString(){
    return "The amazing " + name;

  }

}
