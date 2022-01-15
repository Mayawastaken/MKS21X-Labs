import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    for (int i = 0; i < party.size(); i++){
      Text.go(2, (i)*(WIDTH/party.size())+1);
      System.out.print(party.get(i));
      Text.go(4, (i)*(WIDTH/party.size())+1);
      System.out.print("HP: " + party.get(i).getHP());
      Text.go(3, (i)*(WIDTH/party.size())+1);
      System.out.print(party.get(i).getSpecialName() + ": " + party.get(i).getSpecial() + "/" + party.get(i).getSpecialMax());
      // + party.get value )
    }
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    Text.go(startRow, 2);
    System.out.print(s);
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }

  public static void drawScreen(){
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int i = 1; i < 80; i++){
      System.out.print(Text.colorize("*",Text.MAGENTA));
    }
    for (int i = 1; i < 30; i++){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(i,80);
    }
    for (int i = 80; i > 0; i--){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(30,i);
    }
    for (int i = 30; i > 0; i--){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(i,1);
    }
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer> enemies = new ArrayList<>();
    enemies.add(new Wizard("Apollo"));
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    party.add(new Wizard("Hades"));
    party.add(new Warrior("Persephone"));
    party.add(new Warrior("Hermes"));
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack")){
          Text.go(10,2);
          party.get(whichPlayer).attack(enemies.get(0));
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        else if(input.equals("special")){
          Text.go(10,2);
          party.get(whichPlayer).specialAttack(enemies.get(0));

          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          if (Math.random()<.8){
            Text.go(10,2);
            enemies.get(0).attack(party.get((int)(Math.random()*3)));
          }
          else{
            Text.go(10,2);
            enemies.get(0).specialAttack(party.get((int)(Math.random()*3)));
          }
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}