class C4IsSandwich extends ConsoleProgram {

  /**
  * Return the string that is between the first and last appearance of "bread" 
  * in the given string, or output the empty string "" if there are not two pieces of bread.
  * @author: A. Su
  */
  
  public void run() {
    String strSandwhich = readLine("Enter a string: ");
   int intFirstBreadIndex = strSandwhich.indexOf("bread");
        int intLastBreadIndex = strSandwhich.lastIndexOf("bread");

        if (intFirstBreadIndex != -1 && intLastBreadIndex != -1 && intFirstBreadIndex != intLastBreadIndex) {
            // If "bread" is found twice and it's not the same occurrence
            System.out.println(strSandwhich.substring(intFirstBreadIndex + 5, intLastBreadIndex));
        } else {
            System.out.println (""); 
        }
    }
}
        