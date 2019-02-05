public class StartGame {
  
  public static void main(String[] args) {
    
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    System.out.println("Player1 name is: " + player1.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
    Player player2 = new Player();
    player2.setName("Drew");
    player2.setHealth(100);
    System.out.println("Player2 name is: " +player2.getName());
    
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());

  Attack gun1 = new Attack("Better Devils", 25);
  System.out.println("You have two weapons in your inventory, one of them is: " + gun1.getName() );
  System.out.println("The damage that it will deal is: "+gun1.getDmg());
  
  Attack gun2 = new Attack("Last word", 30);
  System.out.println("You have two weapons in your inventory, the other is: " + gun2.getName() );
  System.out.println("The damage that it will deal is: "+gun2.getDmg());
  }
}