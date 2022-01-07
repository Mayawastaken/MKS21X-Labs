public class Wizard extends Adventurer{
  //private int invisOn;
  private int fireballLevel;
  private String allure;

  public Wizard(){
    super();
    this.fireballLevel = 1;
  }

  public Wizard(String name){
    super(name);
    this.fireballLevel = 1;
  }

  public Wizard(String name, int hp){
    super(name, hp);
    this.fireballLevel = 1;

  }

  public Wizard(String name, int hp, String allure){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = 1;

  }

  public Wizard(String name, int hp, String allure, int fireballLevel){
    this(name, hp);
    this.allure = allure;
    this.fireballLevel = fireballLevel;
  }

  publics void attack(Damageable other){
    int damage = this.fireballLevel * 10;
    other.applyDamage(damage);
  }

  public void specialAttack(Damageable other){

  }

}
