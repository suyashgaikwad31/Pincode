import java.util.regex.*;

public class Demo {
   public static void main(String args[]) {
      String pinCode = "400088";
      String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(pinCode);
      System.out.println("The pin code is: " + pinCode);
      System.out.println("Is the pin code valid? " + pinCode.matches(regex));
   }
}
