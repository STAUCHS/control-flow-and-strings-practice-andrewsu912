class B1DiceGame extends ConsoleProgram {

  /**
   * Write a program that lets you simulate the rolling of 100 pairs of dice.
   * If the pair adds up to 2, print "snake eyes!"
   * If the pair adds up to 7, print "lucky seven"
   * If the pair adds up to any other sum, do not print out anything
   * 
   * @author: A. Su
   */

  public void run() {
    int intNumRolls = 100;

    System.out.println("Simulating the rolling of 100 pairs of dice:");

    for (int i = 1; i <= intNumRolls; i++) {
      int die1 = (int) (Math.random() * 6) + 1;
      int die2 = (int) (Math.random() * 6) + 1;
      int sum = die1 + die2;

      if (sum == 2) {
        System.out.println("Roll " + i + ": snake eyes!");
      } else if (sum == 7) {
        System.out.println("Roll " + i + ": lucky seven");
      }
    }
  }
}
