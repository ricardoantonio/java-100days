import java.util.ArrayList;

public class PlayerTestDrive {

  public static void main(String[] args) {
    ArrayList<Player> players = new ArrayList<Player>();

    // A static method should be called using the class name.
    while (Player.totalPlayers() < GameConstants.MAX_PLAYERS) {
      Player player = new Player();
      players.add(player);
    }
  }
}

class Player {
  // Same value shared by all the instances.
  // One value per clase
  private static int playersCount = 0;

  String name = "Generic";

  // Remember to provide a construct without args in order to
  // give a usable initiated object.
  public Player() {
    playersCount++;
    name = "Player-" + playersCount;
    System.out.println("Player " + playersCount + ": " + name + " was created.");
  }

  public Player(String n) {
    playersCount++;
    name = n;
    System.out.println("Player " + playersCount + ": " + name + " was created.");
  }

  // Static methods can be invoked without any instances of the method's class.
  public static int totalPlayers() {
    return playersCount;
  }

}

// Example on create constants
class GameConstants {
  // final means that ones initialized the value can't be change.
  public static final int MAX_PLAYERS = 3;

  // Making the constructor private this class can't
  // be instantiated.
  private GameConstants() {
  }
}