public class Traingle {
   public static void main (String[] args)
   {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      boolean isTrangle = true; // assumption that it is a traingle
      if ((a+b<c) || (a+c<b) || (b+c<a)) // checks to see if the condition to be a traingle is false
         {
         isTrangle = false;
         } 
       System.out.println (a + " , " + b + " , " + c + ": " + isTrangle);

   }
}
