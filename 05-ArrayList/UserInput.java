import java.util.Scanner;
import java.util.ArrayList;
public class UserInput{
  public static void main(String args[]){
    System.out.println("Enter a non negative number. A negative number will end the program: ");
    Scanner input = new Scanner(System.in);
    ArrayList<Double> nonNegDoubles = new ArrayList<Double>();
    while(input.hasNextDouble()){
      System.out.println("Enter a non negative number. A negative number will end the program: ");
      double checker = input.nextDouble();
      if (checker >= 0){
        nonNegDoubles.add(checker);
      }
      else{
        System.out.println("You entered: " + nonNegDoubles.toString());
        System.out.println("Mean: ");
        System.out.println("Min value: ");
        System.out.println("Max value ");
        input.close();
        break;
      }
    }

  }
}
