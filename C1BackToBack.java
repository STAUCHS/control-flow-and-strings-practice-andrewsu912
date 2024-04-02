class C1BackToBack extends ConsoleProgram {

  /**
   * Given a string, take the last character and print a new string with the last
   * character added at the front and back, so "cat" yields "tcatt". The original
   * string will be length 1 or more.
   * 
   * @author: A. Su
   */

  public void run() {
    String strWord = readLine("Enter a word HI ANDREW: ");

    if (strWord.length() <= 1) {
      System.out.println(strWord); // Return the original string if it's empty or has only one character
    } else {
      char lastChar = strWord.charAt(strWord.length() - 1);
      System.out.println(lastChar + strWord + lastChar); // Concatenate last character at front and back
    }
  }
}