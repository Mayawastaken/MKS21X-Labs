import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int  startingCapacity){
    super(startingCapacity);
  }

  public void add(int index, T element) throws IllegalArgumentException{
    if (!(element == null)){
      super.add(index, element);
    }
    else{
      throw new IllegalArgumentException("null given in set");
    }
  }


  public boolean add(T element) throws IllegalArgumentException{
    if (!(element == null)){
      return super.add(element);
    }
    else{
      throw new IllegalArgumentException("null given in set");
    }
  }


  //wuhoh well um imma try to fix at  home n add constructors <3
  public T set(int index, T str) throws IllegalArgumentException{
    if (!(str == null)){
      return super.set(index, str);
    }
    else{
      throw new IllegalArgumentException("null given in set");
    }
  }
}
