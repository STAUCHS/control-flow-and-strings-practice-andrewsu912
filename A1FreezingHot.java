class A1FreezingHot extends ConsoleProgram {

  /**
   * Given two temperatures via user input, output true if one is less than 0 and
   * the other is greater than 100.
   * 
   * @author: A. Su
   */

  public void run() {

        // Get temperatures
        int intTempOne = readInt("");
        int intTempTwo = readInt("");

        // Checking if one temperature is less than 0 and the other is greater than 100
        boolean isFreezingHot = (intTempOne < 0 && intTempTwo > 100) || (intTempOne > 100 && intTempTwo < 0);

        // Outputting the result
        System.out.println(isFreezingHot);
  }
}
