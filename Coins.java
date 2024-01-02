public class Coins
{
    public static void main(String[] args) 
    {
      int centsamount = Integer.parseInt(args [0]);
      // calculating the amount of quearters and the remaining cents, and printing the full answer
        // #Feedback: better to not do calculation in print commands
        int quarters = centsamount / 25;
        int cents = centsamount % 25;
      System.out.println("Use " + quarters + " quarters and " + cents + " cents");  
   }
}
