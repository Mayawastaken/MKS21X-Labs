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

    /* for (int i = 0; i <= SA.size(); i++){
      System.out.println(SA.get(i)); // hello \n wow \n it \n works! *throws exception, stops program*
    } */

    System.out.println(" ");

    for (int i = 0; i < SA.size(); i++){
      SA.set(i, "" + i);
    }

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

    System.out.println(SA.toString()); // [1, 2, 3, NOPE!]
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
    SA2.add("lizard");
    System.out.println(SA2.toString()); // [cat, fish, dog, parrot, lizard, lizard]
    System.out.println(SA2.toStringDebug()); // [cat, fish, dog, parrot, lizard, lizard, null, null, null]
    System.out.println(" ");
    System.out.println(SA2.indexOf("lizard")); // 4
    System.out.println(SA2.indexOf("parrot")); // 3
    System.out.println(SA2.indexOf("kangaroo")); // -1
    System.out.println(" ");
    System.out.println(SA2.lastIndexOf("lizard")); // 5
    System.out.println(SA2.lastIndexOf("cat")); // 0
    System.out.println(SA2.lastIndexOf("snake")); // -1
    SA2.add(0, "kangaroo");
    System.out.println(SA2.toStringDebug()); // [kangaroo, cat, fish, dog, parrot, lizard, lizard, null, null]
    SA2.add(7, "lizard");
    System.out.println(SA2.toStringDebug()); // [kangaroo, cat, fish, dog, parrot, lizard, lizard, lizard, null]
    SA2.add(2, "snake");
    System.out.println(SA2.toStringDebug()); // [kangaroo, cat, snake, fish, dog, parrot, lizard, lizard, lizard]
    SA2.add(9, "snake");
    System.out.println(SA2.toStringDebug()); // [kangaroo, cat, snake, fish, dog, parrot, lizard, lizard, lizard, snake, null, null, null, null, null, null, null, null, null]
    System.out.println(SA2.size()); // 10
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(SA.toStringDebug()); // [1, 2, 3, NOPE!, null, null, null, null, null, null]
    System.out.println(SA.size()); // 4
    SA.remove(2);
    System.out.println(SA.toStringDebug()); // [1, 2, NOPE!, null, null, null, null, null, null, null]
    System.out.println(SA.size()); // 3
    SA.add(3, "YEP!");
    SA.add(4, "MAYBE!");
    System.out.println(SA.toStringDebug()); // [1, 2, NOPE!, YEP!, MAYBE!, null, null, null, null, null]
    System.out.println(SA.size()); // 5
    System.out.println(SA.remove("YEP!")); // true
    SA.remove("YEP!");
    System.out.println(SA.toStringDebug()); // [1, 2, NOPE!, MAYBE!, null, null, null, null, null, null]
    System.out.println(SA.size()); // 4
    System.out.println(SA.remove("YEP!")); // false

  }
}
