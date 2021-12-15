import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;

  //assume a rectangular grid
  private void addAllWords(String filename){
    ArrayList<String> wordsToBeAdded = loadWordsFromFile(filename);
      // File file = new File(fileName);
      // Scanner input = new Scanner(file);
      // while (input.hasNextLine()){
      //   String current = input.nextLine();
      //   if (current != null){
      //     wordsToBeAdded.add(current);
      //   }
      // }
    while (wordsToBeAdded.size() > 0){
      //double nextRand = randgen.nextDouble();
      int randElement = (int)(rng.nextDouble()*(wordsToBeAdded.size()));
      String current = wordsToBeAdded.get(randElement);
      // System.out.println("nextRand: " + nextRand);
      // System.out.println("randElement: " + randElement);
      // for(String x:wordsToBeAdded) {
      //     System.out.println(x);
      // }
      int i = 0;
      while (i < 100){ //try 100 times then bad word
        int dirNS = (int)(rng.nextDouble()*(3))-1;
        int dirEW = (int)(rng.nextDouble()*(3))-1;
        int startR = (int)(rng.nextDouble()*((grid.length)));
        int startC = (int)(rng.nextDouble()*((grid[0].length)));
        // System.out.println(this.toString());
        // System.out.println(" ");
        // System.out.println("current: " + current);
        // System.out.println("dirNS: " + dirNS + "\n" + "dirEW: " + dirEW + "\n" + "startR: " + startR + "\n" + "startC: " + startC + "\n");
        boolean addWordYes = this.addWord(current, startR, startC, dirNS, dirEW);
        if (addWordYes){ //is this repeating the this.addword um idk
          int r = startR;
          int c = startC;
          for (int n = 0; n < current.length(); n++){
            grid[r][c] = current.charAt(n);
            r += dirNS;
            c += dirEW;
          }
          //wordsAdded.add(current);
          i += 100;
          wordsToBeAdded.remove(randElement);
        }
        else{
          i++;
          if (i == 100){
            wordsToBeAdded.remove(randElement);
          }
        }
      }
    }
  }

  private void fillInRandomLetters(){
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[0].length; j++){
        if (grid[i][j] == '_'){
          int randLetter = rng.nextInt(26) + 65;
          grid[i][j] = (char)(randLetter);
          //do thge rng letters from 1-26 so like rng.nextint(26) + 1
        }
      }
    }
  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }

  public static void main(String[] args){ //fix its pritning twice um
    try{
      WordSearch testYay;
      int rowNum = Integer.parseInt(args[0]);
      int colNum = Integer.parseInt(args[1]);
      String fileWanted = args[2];
      int mode = Integer.parseInt(args[3]);
      if (args.length == 5){
        int seedGiven = Integer.parseInt(args[4]);
        testYay = new WordSearch(rowNum, colNum, fileWanted, seedGiven);
      }
      else{
        testYay = new WordSearch(rowNum, colNum, fileWanted);
      }
      if (mode == 0){
        testYay.fillInRandomLetters();
      }
      System.out.println(testYay.toString());
    } catch (ArrayIndexOutOfBoundsException ex){
      System.out.println("bad args :(");
    }
  }
}
