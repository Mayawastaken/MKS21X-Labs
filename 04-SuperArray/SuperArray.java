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
      str += '"' + data[i] + '"';
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
      str += '"' + data[i] + '"';
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

  public void add(String str){
    for (int i = 0; i < (this.getData()).length; i++){
      if (this.getData()[i] == null){
        this.getData()[i] = str;
        size++;
        break;
      }
    }
  }

}
