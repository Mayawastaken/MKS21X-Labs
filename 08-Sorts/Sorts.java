import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
    int wanted = 1;
    int maya = 43110;
    while (wanted < data.length){
      for (int i = 0; i < data.length - wanted; i++){
        if (data[i] > data[i+1]){
          maya = data[i];
          data[i] = data[i+1];
          data[i+1] = maya;
        }
      }
    wanted++;
    }
  } //yo whyd i make it so complex below


  /*Selection sort
   */
  public static void selectionSort(int[] ary){
    int maya = 0;
    int checker = ary[0];
    int index = -1; //like if we r at the lowest alr the if statemnet wont run so we gotta set index = maya or smth
    //System.out.println(checker);
    while (maya < ary.length){
      index = -1;
      checker = ary[maya];
      //System.out.println("while: " + checker);
      for (int i = maya + 1; i < ary.length; i++){
        if (ary[i] < checker){
          checker = ary[i];
          index = i;
          //System.out.println(checker);
        }
      }
      if (index != -1){
        ary[index] = ary[maya];
        ary[maya] = checker;
      }
      //System.out.println(checker);
      maya++;
    }
  }




  // public static void bubbleSortAH(int[] data){
  //   int checker = 43110;
  //   int wanted = 1;
  //   for (int i = 0; i < data.length - wanted; i++){
  //     checker = data[0];
  //     //System.out.println(checker);
  //     for (int j = i + 1; j < data.length - wanted + 1; j++){
  //       if (checker > data[j]){
  //         data[j-1] = data[j];
  //         data[j] = checker;
  //         //System.out.println(checker);
  //         System.out.println(Arrays.toString(data));
  //       }
  //       else {
  //         checker = data[j];
  //         System.out.println(checker);
  //         //wanted++; //wot is wanted why did i make this
  //         //j += data.length;
  //       }
  //     }
  //     wanted++;
  //   }
  // }

  public static void main(String[] args){ //make method later w random for easier tests; many lengths & tests
    int[] ary1B = {0,1,2,3,4,-1};
    int[] ary2B = {4,2,6,8,-12,34,2,3,-4};
    int[] ary3B = {0,1,0,2,0,0};
    int[] ary4B = {0,1,2,3,4};
    int[] ary5B = {5,1,12,-5,16};

    bubbleSort(ary1B);
    bubbleSort(ary2B);
    bubbleSort(ary3B);
    bubbleSort(ary4B);
    bubbleSort(ary5B);

    System.out.println(Arrays.toString(ary1B));
    System.out.println(Arrays.toString(ary2B));
    System.out.println(Arrays.toString(ary3B));
    System.out.println(Arrays.toString(ary4B));
    System.out.println(Arrays.toString(ary5B));

    System.out.println(" ");

    int[] ary1S = {0,1,2,3,4,-1};
    int[] ary2S = {4,2,6,8,-12,34,2,3,-4};
    int[] ary3S = {0,1,0,2,0,0};
    int[] ary4S = {0,1,2,3,4};
    int[] ary5S = {5,1,12,-5,16};

    selectionSort(ary1S);
    selectionSort(ary2S);
    selectionSort(ary3S);
    selectionSort(ary4S);
    selectionSort(ary5S);

    System.out.println(Arrays.toString(ary1S));
    System.out.println(Arrays.toString(ary2S));
    System.out.println(Arrays.toString(ary3S));
    System.out.println(Arrays.toString(ary4S));
    System.out.println(Arrays.toString(ary5S));

  }
}
