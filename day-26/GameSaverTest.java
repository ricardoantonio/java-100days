import java.io.*;
import java.util.Arrays;

public class GameSaverTest {
  public static void main(String[] args) {
    GameCharacter one = new GameCharacter(50, "Elf", new String[] { "bow", "sword", "dust" });
    GameCharacter two = new GameCharacter(200, "Troll", new String[] { "bare hands", "big ax" });
    GameCharacter three = new GameCharacter(120, "Magician", new String[] { "spells", "invisibility" });

    // Serialize and saving objects in a file
    try {
      FileOutputStream fs = new FileOutputStream("Game.ser");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(one);
      os.writeObject(two);
      os.writeObject(three);
      os.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // Deserialization: Restoring objects
    try {
      FileInputStream isf = new FileInputStream("Game.ser");
      ObjectInputStream is = new ObjectInputStream(isf);
      GameCharacter oneRestore = (GameCharacter) is.readObject();
      GameCharacter twoRestore = (GameCharacter) is.readObject();
      GameCharacter threeRestore = (GameCharacter) is.readObject();
      is.close();

      System.out.println("oneRestore: " + oneRestore);
      System.out.println("twoRestore: " + twoRestore);
      System.out.println("threeRestore: " + threeRestore);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

class GameCharacter implements Serializable {
  private final int power;
  private final String type;
  private final String[] weapons;

  public GameCharacter(int power, String type, String[] weapons) {
    this.power = power;
    this.type = type;
    this.weapons = weapons;
  }

  public int getPower() {
    return power;
  }

  public String getType() {
    return type;
  }

  public String weapons() {
    return Arrays.toString(weapons);
  }

  public String toString() {
    return type + " (" + power + ")";
  }

  public String getStatus() {
    return "El estado es " + power;
  }
}
