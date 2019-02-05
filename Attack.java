public class Attack{
  private String name;
  private int dmg;
  //This is all the creation that I needed to do
  public Attack(String weaponName,int damage){
    this.name = weaponName;
    this.dmg = damage;
  }
  //Copy paste from Player
  public void setName(String weaponName) { 
    if (weaponName.length() < 1) {
      this.name = "invalid";
      return;
    }
    
    this.name = weaponName;
  }
  //Copy paste from Player
  public String getName() {
    return this.name;
  }
    public void setDmg(int weaponDmg){
    weaponDmg = 100;
  }
  public int getDmg(){
    return this.dmg;
  }
}
