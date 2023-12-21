public class Coins
{
    public static void main(String[] args) 
    {
      int centsamount = Integer.parseInt(args [0]);
      // calculating the amount of quearters and the remaining cents, and printing the full answer
      System.out.println("Use " + centsamount/25 + " quarters and " + centsamount%25 + " cents");  
   }
}