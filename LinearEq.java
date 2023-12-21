public class LinearEq {
   public static void main (String[] args)
   {
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]);
      double c = Double.parseDouble(args[2]);
      System.out.println (a + " * x + " + b + " = " + c); // presents the equation
      double x = (c-b)/a; // calculating the value of x
      System.out.println ("x = " + x);//presenting x


   }
}