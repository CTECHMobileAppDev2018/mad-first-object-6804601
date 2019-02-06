public class PlayerAmount{
  public static void main(String[]args){
    
    Player[]playerArray = new Player[4];
    Player player0 = new Player();
    player0.setName("SUB2PEWDS");
    
    playerArray[0] = player0;
    
    for (int i = 0; i < playerArray.length; i++){
      if (playerArray[i] != null){
        System.out.println("Player" + i + " name is: "+playerArray[i].getName());
      }
    }
  }
}

    
      