import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int whereToPlace(T value){
    int i = 0;
    while (i < this.size() && value.compareTo(this.get(i)) >= 0){
      i++;
      }
    return i;
  }

  public void add(int index, T element) throws IllegalArgumentException{
    if (!(element == null)){
      int realIndex = whereToPlace(element);
      super.add(realIndex, element);
    }
    else{
      throw new IllegalArgumentException("null given in add with index and element");
    }
  }

  public boolean add(T element) throws IllegalArgumentException{
    if (!(element == null)){
      int index = whereToPlace(element);
      super.add(index, element);
      return true;
    }
    else{
      throw new IllegalArgumentException("null given in add with element");
    }
  }

  public T set(int index, T element) throws IndexOutOfBoundsException{
    if (!(index < 0 || index >= this.size())){
      T toReturn = this.get(index);
      this.remove(index);
      add(index, element);
      return toReturn;
    }
    else{
      throw new IndexOutOfBoundsException("bad index in set");
    }
  }




}
