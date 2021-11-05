public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    size = 0;
    data = new String[10];
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

  public String[] getData(){
    return data;  /* yes, yes, some of the stuff below I could
    have done with just using data instead of this.getData();
    just thought it to be a good practice to make this accessor. */
  }

  public int size(){
    return size;
  }

  public boolean add(String str){
    data[size] = str;
    size++;
    return true;
   }
/*  public boolean add(String str){
    for (int i = 0; i < (this.getData()).length; i++){
      if (this.getData()[i] == null){
        this.getData()[i] = str;
        size++;
        break;
      }
    }
    return true;
  }
  */


  public String get(int index){
    if ((index < 0) || (index >= size)){
      System.out.println("error in get: index out of range");
      return null;
    }
    return data[index];
  }

  public String set(int index, String element){
    if ((index < 0) || (index >= size)){
      System.out.println("error in set: index out of range");
      return null;
    }
    String buhbye = data[index];
    data[index] = element;
    return buhbye;
  }
}
