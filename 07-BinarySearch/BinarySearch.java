import java.util.Arrays;
public class BinarySearch{
  public static int binarySearch(int[] data, int target){
    int start = 0;
    int end = data.length - 1;
    int mid = 43110;
    while (start <= end){
      mid = (start + end) / 2;
      if (data[mid] == target){
        return mid;
      }
      else if (data[mid] < target){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1

    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6

    // Custom input array, but you can make it randomly
    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

    System.out.println(Arrays.toString(arr));
    //Arrays.sort() changes the array, no return value
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.println(" ");
    System.out.println(binarySearch(arr, 6));
    System.out.println(binarySearch(arr, 7));
    System.out.println(binarySearch(arr, 9));
    System.out.println(binarySearch(arr, 13));
    System.out.println(binarySearch(arr, 21));
    System.out.println(binarySearch(arr, 45));
    System.out.println(binarySearch(arr, 101));
    System.out.println(binarySearch(arr, 102));
    System.out.println(binarySearch(arr, -102));
  }


}
