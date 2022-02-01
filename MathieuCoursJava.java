/**
 * Trying if-else statement.
 * Try mark = 0, 49, 50, 51, 100 and verify your results.
 */
public class MathieuCoursJava {  // Save as "CheckPassFail.java"
   public static void main(String[] args) {  // Program entry point
      int mark = 49;   // Set the value of "mark" here!
      System.out.println("The mark is " + mark);
 
      // if-else statement
      if ( mark >= 50 ) {
         System.out.println( "PASS" );
      } else {
         System.out.println( "FAIL" );
      }
      System.out.println( "DONE" );
   }
}