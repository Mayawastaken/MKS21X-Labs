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


  public String[] getData(){
    return data;
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
