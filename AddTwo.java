public class AddTwo {
   public static void main(String[] args) {
      // Performs adding calculation on two commnand-line arguments
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      // #Feedback: better to not do calculation in print commands
      int sum = a + b;
      System.out.println(a + " + " + b + " = " + sum);
      
   }
}
