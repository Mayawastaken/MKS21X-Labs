public class SuperTester{
  public static void main(String[]args){
    SuperArray SA = new SuperArray();
    SuperArray SA2 = new SuperArray(4);


    System.out.println(SA.toString()); // []
    System.out.println(SA.toStringDebug()); // [null, null, null, null, null, null, null, null, null, null]
    System.out.println(" ");
    SA.add("hello");
    System.out.println(SA.toString()); // [hello]
    SA.add("wow");
    SA.add("it");
    SA.add("works!");
    System.out.println(SA.toString()); // [hello, wow, it, works!]
    System.out.println(SA.toStringDebug()); // [hello, wow, it, works!, null, null, null, null, null, null]

    System.out.println(" ");

    for (int i = 0; i < SA.size(); i++){
      System.out.println(SA.get(i)); // hello \n wow \n it \n works!
    }

    System.out.println(" ");

    for (int i = 0; i <= SA.size(); i++){
      System.out.println(SA.get(i)); // hello \n wow \n it \n works! \n error in get: index out of range \n null
    }

    System.out.println(" ");

    for (int i = 0; i < SA.size(); i++){
      SA.set(i, "" + i); // *sets the elements to their index value*
    } //AYUDA !!! later - hmmm its not printing the elements that were before the change, even if i add a print here

    System.out.println(" ");

    System.out.println(SA.toString()); // [0, 1, 2, 3]
    System.out.println(SA.toStringDebug()); // [0, 1, 2, 3, null, null, null, null, null, null]

    System.out.println(" ");

    for (int i = 0; i < SA.size(); i++){
      if (i < SA.size() - 1){
        SA.set(i, SA.get(i+1));
      }
      else {
        SA.set(i, "NOPE!");
      }
    }

    System.out.println(" ");

    System.out.println(SA.toString()); // [0, 1, 2, NOPE!]
    System.out.println(SA.toStringDebug()); // [1, 2, 3, NOPE!, null, null, null, null, null, null]

    System.out.println(" ");

    System.out.println(SA2.toString()); // []
    System.out.println(SA2.toStringDebug()); // [null, null, null, null]
    SA2.add("cat");
    SA2.add("fish");
    SA2.add("dog");
    SA2.add("parrot");
    System.out.println(SA2.toString()); // [cat, fish, dog, parrot]
    System.out.println(SA2.toStringDebug()); // [cat, fish, dog, parrot]
    System.out.println(" ");
    SA2.add("lizard");
    System.out.println(SA2.toString()); // UMM !!!! have no idea what is occuring; will fix in school
    System.out.println(SA2.toStringDebug()); // "

  }
}
