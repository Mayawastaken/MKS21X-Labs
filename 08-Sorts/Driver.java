import java.util.Arrays;
  public class Driver{

    public static void main(String[]artie){

      int[] randish = new int[Integer.parseInt(artie[0])];
      for(int i = 0 ; i < randish.length; i++){
        randish[i] =(int)(Math.random()*10000);
      }

      if(artie[1].equals("selection")){
        //if it works this is for timing purposes.
        Sorts.selectionSort(randish);
      }
      if(artie[1].equals("bubble")){
        //if it works this is for timing purposes.
        Sorts.bubbleSort(randish);
      }
      if(artie[1].equals("insertion")){
        //if it works this is for timing purposes.
        Sorts.insertionSort(randish);
      }
      if(artie[1].equals("test")){
        //if you need to check if it works this is for verification of correctness
        int[] randish1 = Arrays.copyOf(randish,randish.length);
        int[] randish2 = Arrays.copyOf(randish,randish.length);
        int[] randish3 = Arrays.copyOf(randish,randish.length);
        Sorts.selectionSort(randish);
        Sorts.insertionSort(randish1);
        Sorts.bubbleSort(randish2);
        Arrays.sort(randish3);
        if( Arrays.equals(randish,randish3)){
          System.out.println("Selection Correct!");
        }else{
         System.out.println("Selection BROKEN!!!!");
        }
        if( Arrays.equals(randish2,randish3)){
          System.out.println("Bubble Correct!");
        }else{
         System.out.println("Bubble BROKEN!!!!");
        }
        if(Arrays.equals(randish1,randish3)){
          System.out.println("Insertion Correct!");
        }else{
         System.out.println("Insertion BROKEN!!!!");
        }
      }
    }
  }
