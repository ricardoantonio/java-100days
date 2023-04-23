
public class SimpleStartupTestDrive {
  public static void main(String[] args) {
    SimpleStartup dot = new SimpleStartup();

    int[] locations = { 2, 3, 4 };
    dot.setLocationCell(locations);

    int userGuess = 4;
    String result = dot.checkYourself(userGuess);

    String testResult = "failed";
    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println("User guess the location: " + testResult);

  }
}

class SimpleStartup {
  private int[] locationCells;
  private int numOfHits = 0;

  public void setLocationCell(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(int guess) {
    String result = "miss";

    for (int cell : locationCells) {
      if (guess == cell) {
        result = "hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    System.out.println(result);
    return result;
  }
}