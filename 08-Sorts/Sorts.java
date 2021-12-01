public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){

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

    System.out.println(ary1.toString());
    System.out.println(ary2.toString());
    System.out.println(ary3.toString());
    System.out.println(ary4.toString());
    System.out.println(ary5.toString());


  }
}
