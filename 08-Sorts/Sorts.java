import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int checker = 43110;
    int wanted = 1;
    for (int i = 0; i < data.length - wanted; i++){
      checker = data[i];
      for (int j = i + 1; j < data.length; j++){
        if (checker > data[j]){
          data[j-1] = data[j];
          data[j] = checker;
        }
        else {
          wanted++;
          j += data.length;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] ary1 = {0,1,2,3,4,-1};
    int[] ary2 = {4,2,6,8,-12,34,2,3};
    int[] ary3 = {0,1,0,2,0,0};
    int[] ary4 = {0,1,2,3,4};
    int[] ary5 = {5,1,12,-5,16};

    bubbleSort(ary1);
    bubbleSort(ary2);
    bubbleSort(ary3);
    bubbleSort(ary4);
    bubbleSort(ary5);

    System.out.println(Arrays.toString(ary1));
    System.out.println(Arrays.toString(ary2));
    System.out.println(Arrays.toString(ary3));
    System.out.println(Arrays.toString(ary4));
    System.out.println(Arrays.toString(ary5));
  }
}
