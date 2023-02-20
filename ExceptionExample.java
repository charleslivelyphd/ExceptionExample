// This class demonstrates the use of a try-catch block to handle an exception thrown in the divide method
public class ExampleExceptions {
  
  // The main method is the entry point for the program
  public static void main(String[] args) {
    try {
      // Call the divide method with arguments 10 and 0
      int result = divide(10, 0);
      // If the divide method completes successfully, print the result to the console
      System.out.println(result);
    } catch (ArithmeticException e) {
      // If an ArithmeticException is thrown, catch it and print an error message to the console
      System.out.println("Cannot divide by zero!");
    }
  }

  // The divide method takes two integers as arguments and returns their quotient
  public static int divide(int a, int b) {
    if (b == 0) {
      // If the second argument is 0, throw an ArithmeticException
      throw new ArithmeticException();
    }
    // If the second argument is not 0, return the quotient of the two arguments
    return a / b;
  }
}
