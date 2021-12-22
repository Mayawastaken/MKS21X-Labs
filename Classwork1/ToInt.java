public class ToInt{

  public static int valueOfChar(char c){
    return c-48;
  }

  public static int stringToInt(String s){
    int answer = 0;
    for (int i = 0; i < s.length(); i++){
      answer += valueOfChar(s.charAt(i)) * Math.pow(10, s.length() - i - 1);
    }
    return answer;
   //return the value of Integer.parseInt(s) but do it yourself!
   //Do not use any built in parse methods.
 }

 public static void main(String[] args){
   System.out.println(stringToInt("1001"));
   System.out.println(stringToInt("97"));
   System.out.println(stringToInt("1001") + stringToInt("97"));
 }

}
