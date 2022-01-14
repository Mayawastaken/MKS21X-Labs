public class Wizard extends Adventurer{
  //private int invisOn;
  private int fireballLevel;
  private String allure;
  private int fireballMax;

  public Wizard(){
    super();
    this.fireballLevel = 1;
    this.allure = "Come closer, I won't burn...";
    this.fireballMax = 50;
  }

  public Wizard(String name){
    super(name);
    this.fireballLevel = 1;
    this.allure = "Come closer, I won't burn...";
    this.fireballMax = 50;
  }

  public Wizard(String name, int hp){
    super(name, hp);
    this.fireballLevel = 1;
    this.allure = "Come closer, I won't burn...";
    this.fireballMax = 50;
  }

  public Wizard(String name, int hp, String allure){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = 1;
    this.fireballMax = 50;
  }

  public Wizard(String name, int hp, String allure, int fireballLevel){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = fireballLevel;
    this.fireballMax = 50;
  }

  public void attack(Damageable other){
    int damage = (int)(Math.random()*8)+1;
    other.applyDamage(damage);
    this.fireballLevel++;
    System.out.println(this + " inflicted the wrath of the Devil on " + other + " for " + damage + " fire damage!");
  }

  public void specialAttack(Damageable other){
    if(this.fireballLevel > 5){
      int damage = (int)(Math.random()*8)+8;
      other.applyDamage(damage);
      System.out.print(this + " reassures " +  other + ", '" + this.allure + "', fooling " + other + "! ");
      System.out.println(this + " allures " + other + " with the power of the Underworld, inflicting " + damage + " ultrafire damage!");
      this.fireballLevel -= 5;
    }
    else{
      System.out.println("Thy fireball too weak, I'm afraid...");
      attack(other);
    }
  }

  public String getSpecialName(){
    return "Fire level";
  }
  public int getSpecialMax(){
    return fireballMax;
  }
  public int getSpecial(){
    return fireballLevel;
  }

}
