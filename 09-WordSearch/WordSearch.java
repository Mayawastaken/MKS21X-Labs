/*Lab9: Word Search generator
*/
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordSearch{
    private char[][]data;
    int seed;
    Random randgen;
    ArrayList<String> wordsAdded;
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

    public WordSearch(int rows, int cols, String fileName){
      this(rows, cols);
      wordsAdded = new ArrayList<String>();
      try{
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        this.addAllWords(fileName); //this. or? yo im so lost
      } catch (FileNotFoundException ex) {
        System.out.println("ayo your file isn't working D:");
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
   //  public boolean addWordHorizontal(String word,int row, int col){
   //    int i = 0;
   //    if (row > data.length - 1){
   //      return false;
   //    }
   //    if (col + word.length() > data[0].length){ //takes adv. of rect.
   //      return false;
   //    }
   //    for (int j = col; j < col + word.length(); j++){
   //      if ((data[row][j] != '_') && data[row][j] != word.charAt(i)){
   //        return false;
   //      }
   //      i++;
   //    }
   //    i = 0;
   //    for (int m = col; m < col + word.length(); m++){
   //      data[row][m] = word.charAt(i);
   //      i++;
   //    }
   //    return true;
   //  }
   //
   //
   // /**Attempts to add a given word to the specified position of the WordGrid.
   //   *The word is added from top to bottom, must fit on the WordGrid, and must
   //   *have a corresponding letter to match any letters that it overlaps.
   //   *
   //   *@param word is any text to be added to the word grid.
   //   *@param row is the vertical locaiton of where you want the word to start.
   //   *@param col is the horizontal location of where you want the word to start.
   //   *@return true when the word is added successfully. When the word doesn't fit,
   //   *or there are overlapping letters that do not match, then false is returned.
   //   *and the board is NOT modified.
   //   */
   //  public boolean addWordVertical(String word,int row, int col){
   //    int i = 0;
   //    if (col > data[0].length - 1){ //takes adv. of rect.
   //      return false;
   //    }
   //    if (row + word.length() > data.length){
   //      return false;
   //    }
   //    // fix below
   //    for (int j = row; j < row + word.length(); j++){
   //      if ((data[j][col] != '_') && data[j][col] != word.charAt(i)){
   //        return false;
   //      }
   //      i++;
   //    }
   //    i = 0;
   //    for (int m = row; m < row + word.length(); m++){
   //      data[m][col] = word.charAt(i);
   //      i++;
   //    }
   //    return true;
   //  }
   //
   //  /**Attempts to add a given word to the specified position of the WordGrid.
   //   *The word is added from top left towards the bottom right, it must fit on the board,
   //   *and must have a corresponding letter to match any letters that it overlaps.
   //   *
   //   *@param word is any text to be added to the word grid.
   //   *@param row is the vertical locaiton of where you want the word to start.
   //   *@param col is the horizontal location of where you want the word to start.
   //   *@return true when the word is added successfully. When the word doesn't fit,
   //   *or there are overlapping letters that do not match, then false is returned
   //   *and the board is not modified.
   //   */
   //  public boolean addWordDiagonal(String word,int row, int col){
   //    if (data.length == 0){
   //      return false;
   //    }
   //    if (data[0].length == 0){
   //      return false;
   //    }
   //    int numInDiag = Math.min((data.length - row), (data[0].length - col));
   //    if (word.length() > numInDiag){ //takes adv. of rect.
   //      return false;
   //    }
   //    int n = 0;
   //    int i = row;
   //    for (int j = col; j < col + word.length(); j++){
   //      if ((data[i][j] != '_') && data[i][j] != word.charAt(n)){
   //        return false;
   //      }
   //      i++;
   //      n++;
   //    }
   //    i = row;
   //    n = 0;
   //    for (int j = col; j < col + word.length(); j++){
   //      data[i][j] = word.charAt(n);
   //      i++;
   //      n++;
   //    }
   //    return true;
   //  }

    public boolean addWord(String word, int row, int col, int rowInc, int colInc){ //-1. 0, 1
      if (rowInc == 0 && colInc == 0){
        return false;
      }
      if (row > data.length - 1 || row < 0 || col > data[0].length - 1 || col < 0){ //assuming >= 1 row in data
        return false;
      }
      if ((row + rowInc * (word.length()-1) > data.length-1) || (row + rowInc * (word.length()-1) < 0)){
        return false;
      }
      if ((col + colInc * (word.length()-1) > data[0].length-1) || (col + colInc * (word.length()-1) < 0)){
        return false;
      }
      int i = row;
      int j = col;
      for (int n = 0; n < word.length(); n++){
        if ((data[i][j] != '_') && data[i][j] != word.charAt(n)){
          return false;
        }
        i += rowInc;
        j += colInc;
      }
      i = row;
      j = col;
      for (int n = 0; n < word.length(); n++){
        data[i][j] = word.charAt(n);
        i += rowInc;
        j += colInc;
      }
      return true;
    }

    public void addAllWords(String fileName){
      ArrayList<String> wordsToBeAdded = new ArrayList<String>();
      try{
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
          String current = input.nextLine();
          if (current != null){
            wordsToBeAdded.add(current);
          }
        }
        while (wordsToBeAdded.size() > 0){
          int randElement = (int)(Math.random()*(wordsToBeAdded.size()));
          String current = wordsToBeAdded.get(randElement);
          int i = 0;
          while (i < 5){ //try 5 times then bad word
            int dirNS = (int)(Math.random()*(3))-1;
            int dirEW = (int)(Math.random()*(3))-1;
            int startR = (int)(Math.random()*((data.length)));
            int startC = (int)(Math.random()*((data[0].length)));
            System.out.println(this.toString());
            System.out.println(" ");
            System.out.println("current: " + current);
            System.out.println("dirNS: " + dirNS + "\n" + "dirEW: " + dirEW + "\n" + "startR: " + startR + "\n" + "startC: " + startC + "\n");
            boolean addWordYes = this.addWord(current, startR, startC, dirNS, dirEW);
            if (addWordYes){ //is this repeating the this.addword um idk
              int r = startR;
              int c = startC;
              for (int n = 0; n < current.length(); n++){
                data[r][c] = current.charAt(n);
                r += dirNS;
                c += dirEW;
              }
              wordsAdded.add(current);
              i += 5;
              wordsToBeAdded.remove(randElement);
            }
            else{
              i++;
              if (i == 5){
                wordsToBeAdded.remove(randElement);
              }
            }
          }
        }
      } catch (FileNotFoundException ex) {
        System.out.println("ayo your file isn't working D:");
      }
    }

    public static void main(String[] args){
      // WordSearch W1 = new WordSearch(3, 4);
      // WordSearch W2 = new WordSearch(4, 3);
      // WordSearch W3 = new WordSearch(10, 12);
      // WordSearch W4 = new WordSearch(9, 11);
      //WordSearch W5 = new WordSearch(3, 4, "WordSearch1.txt");
      //WordSearch W6 = new WordSearch(4, 3, "WordSearch1.txt");
      //WordSearch W7 = new WordSearch(10, 12, "WordSearch1.txt");
      WordSearch W8 = new WordSearch(9, 11, "WordSearch1.txt");

      // System.out.println(W1.toString());
      // System.out.println(" ");
      // System.out.println(W2.toString());
      // System.out.println(" ");
      // System.out.println(W3.toString());
      // System.out.println(" ");

      // W3.addWordHorizontal("GRAPE", 9, 7);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordHorizontal("YUMMY", 0, 0);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordHorizontal("MYRIAD", 0, 3);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordVertical("GRAPE", 5, 11);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordVertical("YUMMY", 0, 0);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordVertical("MYRIAD", 2, 1);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordDiagonal("YUMMY", 0, 0);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordDiagonal("MYRIAD", 2, 1);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");
      //
      // W3.addWordDiagonal("GRAPE", 5, 7);
      //
      // System.out.println(W3.toString());
      // System.out.println(" ");

      // W4.addWord("TEST", 4, 5, 0, 1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, 0, -1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, 1, 0);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, -1, 0);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, 1, 1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, 1, -1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, -1, 1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("TEST", 4, 5, -1, -1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      //
      // W4.addWord("TEST", 5, 5, -1, -1); //nothing happens good
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("MAYA", 8, 11, -1, -1); //nothing happens good
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("MAYA", 9, 10, -1, -1); //nothing happens good
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("MAYA", 8, 10, -1, -1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // W4.addWord("MAAM", 8, 7, 0, 1);
      // System.out.println(W4.toString());
      // System.out.println(" ");
      // System.out.println(" ");

      System.out.println(W8.toString());
      //tested a lot of ouT of bounds (esp on corners)/overlapping wrong words before this, seem ok
    }
}
