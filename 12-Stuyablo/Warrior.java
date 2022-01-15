public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int rageMax;

    public Warrior(){
	     this("Magnus");
       this.rageMax = 200;
       setmaxHP(150);
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
       this.rageMax = 200;
       setmaxHP(150);
    }

    public Warrior(String name, String warcry, int rage){
      super(name,120+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      this.rageMax = 200;
      setmaxHP(150);
    }

    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getRage() + 1);
  	    return (this +
            " attacked " + other + " for " +
            damage + " damage!");
    }

    public String specialAttack(Damageable other){
	     if(getRage() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            setRage(getRage() - 10);
            return (this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+warcry);
	    }else{
          String toReturn = "Not enough rage! \n" + Text.colorize("*",Text.MAGENTA) + attack(other);
          return toReturn;
	    }
    }

    public String getSpecialName(){
      return "Rage";
    }
    public int getSpecialMax(){
      return rageMax;
    }
    public int getSpecial(){
      return rage;
    }

    //get methods

    public int getRage(){
	     return rage;
    }

    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }


}
