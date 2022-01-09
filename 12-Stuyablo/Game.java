public class Game{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    System.out.println("");

    Adventurer Wi1 = new Wizard("Hermes");
    Adventurer Wi2 = new Wizard("Hecate", 32);
    Adventurer Wi3 = new Wizard("Hades", 64, "It'll be okay, I don't bite...", 11);
    Adventurer Wi4 = new Wizard("Persephone", 40, "I'm a florist, I don't work with fire!", 6);


    System.out.println(Wi1+" ("+Wi1.getHP()+"HP)");
    System.out.println(Wi2+" ("+Wi2.getHP()+"HP)");
    System.out.println(Wi3+" ("+Wi3.getHP()+"HP)");
    System.out.println(Wi4+" ("+Wi4.getHP()+"HP)");
    Wi3.attack(Wi2);
    System.out.println(Wi2+" ("+Wi2.getHP()+"HP)");
    Wi4.attack(Wi1);
    System.out.println(Wi1+" ("+Wi1.getHP()+"HP)");
    Wi3.specialAttack(Wi4);
    System.out.println(Wi4+" ("+Wi4.getHP()+"HP)");
    Wi3.specialAttack(Wi4);
    System.out.println(Wi4+" ("+Wi4.getHP()+"HP)");
    Wi3.specialAttack(Wi4);
    System.out.println(Wi4+" ("+Wi4.getHP()+"HP)");
    Wi4.specialAttack(Wi3);
    System.out.println(Wi3+" ("+Wi3.getHP()+"HP)");


    }

}
