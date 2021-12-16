import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  //wuhoh well um imma try to fix at  home n add constructors <3
  public T set(int index, T str){
    if (!(str == null)){
      super.set(index, str);
    }
    else{
      throw new IllegalArgumentException("null given in set");
    }
  }
}
