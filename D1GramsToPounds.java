class D1GramsToPounds extends ConsoleProgram {

  /**
  * Description: Write a program that outputs a formatted table that shows a 
  * conversion from grams to pounds from 100 to 1000 grams.
  * @author: A. Su
  */
  
  public void run() {
  double dblPounds;

    System.out.printf("%6s %9s %n", "Grams", "Pounds");
    System.out.println("------------------");

    for (int intGrams = 100; intGrams <= 1000; intGrams += 100){
      dblPounds = intGrams / 453.6;
      System.out.printf("%5d %10.4f %n", intGrams, dblPounds);
    }
  }
}
