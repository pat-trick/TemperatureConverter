/**
 * Created by patrick on 2/3/15.
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    double c, f;
    String firstArg = "0";
    double secondArg = 0;
    if (args.length > 0) {
      firstArg = args[0];
    } else {
      System.out.println("No arguments provided; please provide -F or -C, followed by value.");
      System.exit(1);
    }
    if( args.length > 1 ) {
      try {
        secondArg = Double.parseDouble(args[1]);
      }
      catch(NumberFormatException e ) {
        System.err.println("Second argument is not a properly formatted number.");
        System.exit(1);
      }
    }
    if (firstArg.equals("-F")) {
      f = secondArg;
      c = (f - 32) * 5/9;
      System.out.println("Celsius value is " + c);
    } else if (firstArg.equals("-C")) {
      c = secondArg;
      f = (c * 9/5) + 32;
      System.out.println("Fahrenheit value is " + f);
    }
    else {
      System.out.println("Second intput is invalid.");
      System.exit(1);
    }
  }
}
