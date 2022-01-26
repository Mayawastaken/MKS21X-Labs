public class RecursionPrac{
  public static int fact(int n){
    if (n > 0){
      return n * fact(n-1);
    }
    else{
      return 1;
    }
  }

  public static boolean isEven(int x){
    if (x < 0){
      return isEven(-x);
    }
    if (x > 1){
      return isEven(x-2);
    }
    else{
      return x == 0;
    }
  }

  public static void main(String[] args){
    System.out.println(fact(10));
    System.out.println(isEven(10));
    System.out.println(isEven(11));
    System.out.println(isEven(-10));
    System.out.println(isEven(-11));

  }
}
