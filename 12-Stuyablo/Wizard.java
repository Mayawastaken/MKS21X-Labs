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
    setmaxHP(120);
  }

  public Wizard(String name){
    super(name);
    this.fireballLevel = 1;
    this.allure = "Come closer, I won't burn...";
    this.fireballMax = 50;
    setmaxHP(120);
  }

  public Wizard(String name, int hp){
    super(name, hp);
    this.fireballLevel = 1;
    this.allure = "Come closer, I won't burn...";
    this.fireballMax = 50;
    setmaxHP(120);
  }

  public Wizard(String name, int hp, String allure){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = 1;
    this.fireballMax = 50;
    setmaxHP(120);
  }

  public Wizard(String name, int hp, String allure, int fireballLevel){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = fireballLevel;
    this.fireballMax = 50;
    setmaxHP(120);
  }

  public String attack(Damageable other){
    int damage = (int)(Math.random()*8)+1;
    other.applyDamage(damage);
    this.fireballLevel++;
    return (this + " inflicted the wrath of the Devil on " + other + " for " + damage + " fire damage!");
  }

  public String specialAttack(Damageable other){
    if(this.fireballLevel > 5){
      int damage = (int)(Math.random()*8)+8;
      other.applyDamage(damage);
      this.fireballLevel -= 5;
      return (this + " reassures " +  other + ", '" + this.allure + "', fooling " + other + "! " + this + " allures " + other + " with the power of the Underworld, inflicting " + damage + " ultrafire damage!");
    }
    else{
      String toReturn = "Thy fireball too weak, I'm afraid...\n" + attack(other);
      return toReturn;
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
