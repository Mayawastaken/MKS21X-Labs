/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String crossWord = "";
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          crossWord += data[i][j];
          if (j < data[i].length - 1){
            crossWord += " ";
          }
        }
        if (i < data.length - 1){
          crossWord += "\n";
        }
      }
      return crossWord;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      int i = 0;
      if (row > data.length - 1){
        return false;
      }
      if (col + word.length() > data[0].length){ //takes adv. of rect.
        return false;
      }
      for (int j = col; j < col + word.length(); j++){
        if ((data[row][j] != '_') && data[row][j] != word.charAt(i)){
          return false;
        }
        i++;
      }
      i = 0;
      for (int m = col; m < col + word.length(); m++){
        data[row][m] = word.charAt(i);
        i++;
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
      int i = 0;
      if (col > data[0].length - 1){ //takes adv. of rect.
        return false;
      }
      if (row + word.length() > data.length){
        return false;
      }
      // fix below
      for (int j = row; j < row + word.length(); j++){
        if ((data[j][col] != '_') && data[j][col] != word.charAt(i)){
          return false;
        }
        i++;
      }
      i = 0;
      for (int m = row; m < row + word.length(); m++){
        data[m][col] = word.charAt(i);
        i++;
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      if (data.length == 0){
        return false;
      }
      if (data[0].length == 0){
        return false;
      }
      int numInDiag = Math.min((data.length - row), (data[0].length - col));
      if (word.length() > numInDiag){ //takes adv. of rect.
        return false;
      }
      int n = 0;
      int i = row;
      for (int j = col; j < col + word.length(); j++){
        if ((data[i][j] != '_') && data[i][j] != word.charAt(n)){
          return false;
        }
        i++;
        n++;
      }
      i = row;
      n = 0;
      for (int j = col; j < col + word.length(); j++){
        data[i][j] = word.charAt(n);
        i++;
        n++;
      }
      return true;
    }

    public boolean addWord(String word, int row, int col, int NS, int EW){ //-1. 0, 1
      return true;
    }

    public static void main(String[] args){
      WordSearch W1 = new WordSearch(3, 4);
      WordSearch W2 = new WordSearch(4, 3);
      WordSearch W3 = new WordSearch(10, 12);
      System.out.println(W1.toString());
      System.out.println(" ");
      System.out.println(W2.toString());
      System.out.println(" ");
      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordHorizontal("GRAPE", 9, 7);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordHorizontal("YUMMY", 0, 0);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordHorizontal("MYRIAD", 0, 3);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordVertical("GRAPE", 5, 11);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordVertical("YUMMY", 0, 0);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordVertical("MYRIAD", 2, 1);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordDiagonal("YUMMY", 0, 0);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordDiagonal("MYRIAD", 2, 1);

      System.out.println(W3.toString());
      System.out.println(" ");

      W3.addWordDiagonal("GRAPE", 5, 7);

      System.out.println(W3.toString());
      System.out.println(" ");


      //tested a lot of ouT of bounds (esp on corners)/overlapping wrong words before this, seem ok
    }
}
