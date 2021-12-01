public class BinarySearch{
  public static int binarySearch(int[] data, int target){
    int start = 0;
    int end = data.length;
    int mid = 43110;
    while (start < end){
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
    if ((start == end) && (start == 0) && (data[start] == data[end])){
     return start;
    }
    if ((start == end) && (start == data.length-1) && (data[start] == data[end])){
     return start;
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
  }


}
