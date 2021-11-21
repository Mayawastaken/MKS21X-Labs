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
        if (nonNegDoubles.size() > 0){
          double min = nonNegDoubles.get(0);
          double max = nonNegDoubles.get(0);
          for (int i = 1; i < nonNegDoubles.size(); i++){
            if (nonNegDoubles.get(i) < min){
              min = nonNegDoubles.get(i);
            }
            if (nonNegDoubles.get(i) > max){
              max = nonNegDoubles.get(i);
            }
          }
          double sum = 0;
          for (int i = 0; i < nonNegDoubles.size(); i++){
            sum += nonNegDoubles.get(i);
          }
          double mean = sum / nonNegDoubles.size();
          System.out.println("Mean: " + mean);
          System.out.println("Min value: " + min);
          System.out.println("Max value " + max);
        }
        else {
          System.out.println("Mean: N/A");
          System.out.println("Min value: N/A");
          System.out.println("Max value: N/A");
        }

        input.close();
        break;
      }
    }
  }
}
