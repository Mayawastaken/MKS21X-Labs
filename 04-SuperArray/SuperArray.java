public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("error in SuperArray: illegal argument");
    }
    size = 0;
    data = new String[initialCapacity];
  }

  public String toString(){
    String str = "[";
    for (int i = 0; i < size; i++){
      str += data[i];
      if (i < size - 1){
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public String toStringDebug(){
    String str = "[";
    for (int i = 0; i < data.length; i++){
      str += data[i];
      if (i < data.length - 1){
        str += ", ";
      }
    }
    str += "]";
    return str;
  }

  public int size(){
    return size;
  }

  private void resize(){
    String[] newAr = new String[data.length * 2 + 1];
    for (int i = 0; i < size; i++){
      newAr[i] = data[i];
    }
    data = newAr;
  }

  public boolean add(String str){
    if (size == data.length){
      this.resize();
    }
    data[size] = str;
    size++;
    return true;
   }

  public String get(int index){
    if ((index < 0) || (index >= size)){
      throw new IndexOutOfBoundsException("error in get: index out of bounds");
      //System.out.println("error in get: index out of range");
      //return null;
    }
    return data[index];
  }

  public String set(int index, String element){
    if ((index < 0) || (index >= size)){
      throw new IndexOutOfBoundsException("error in set: index out of bounds");
      //System.out.println("error in set: index out of range");
      //return null;
    }
    String buhbye = data[index];
    data[index] = element;
    return buhbye;
  }


  public int indexOf(String target){
    for (int i = 0; i < size; i++){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = size - 1; i >= 0; i--){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }

  public void add(int index, String value){
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("error in add (w/ index): index out of bounds");
      //System.out.println("error in add: index out of range");
    }
    else{
      if (size == data.length){
        this.resize();
      }
      for (int i = size; i > index; i--){
        data[i] = data[i-1];
      }
      data[index] = value;
      size++;
    }
  }

  public String remove(int index){
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("error in remove: index out of bounds");
      //System.out.println("error in remove: index out of range");
      //return null;
    }
    else{
      String returning = data[index];
      for (int i = index; i < size - 1; i++){
        data[i] = data[i+1];
      }
      data[size - 1] = null;
      size--;
      return returning;
    }
  }

  public boolean remove(String target){
    for (int i = 0; i < size; i++){
      if (target.equals(data[i])){
        for (int j = i; j < size - 1; j++){
          data[j] = data[j+1];
        }
        data[size - 1] = null;
        size--;
        return true;
      }
    }
    return false;
  }

}
