import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public void add(int index, T element) throws IllegalArgumentException{
    if (!(element == null)){
      super.add(index, element);
    }
    else{
      throw new IllegalArgumentException("null given in add with index and element");
    }
  }


  public boolean add(T element) throws IllegalArgumentException{
    if (!(element == null)){
      return super.add(element);
    }
    else{
      throw new IllegalArgumentException("null given in add with element");
    }
  }


  //wuhoh well um imma try to fix at  home n add constructors <3
  public T set(int index, T element) throws IllegalArgumentException{
    if (!(element == null)){
      return super.set(index, element);
    }
    else{
      throw new IllegalArgumentException("null given in set");
    }
  }
}
