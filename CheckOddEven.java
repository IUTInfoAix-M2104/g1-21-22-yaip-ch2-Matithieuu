/**
 * Trying if-else statement and modulus (%) operator.
 * Try number = 0, 1, 88, 99, -1, -2 and verify your results.
 */
public class CheckOddEven {   // Save as "CheckOddEven.java"
   public static void main(String[] args) {  // Program entry point
      int number = -2;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number%2 == 0 ) {
         System.out.println( "Odd Number" );   // even number
      } else {
         System.out.println( "Even Number" );   // odd number
      }
      System.out.println( "bye !" );
   }
}