public class GenThree {
   public static void main (String[] args)
   {
      int bottom = Integer.parseInt(args[0]);// range bottom
      int top = Integer.parseInt(args[1]);// range top

      /*
         #feedback:
         The names you used for the variables below are really bad.
         Try always to use a meaningfull names that explain the purpose of the value.
         In addition, you use 2 variables for 1 relevant information, it's better to not store to much data in memory.
         You can simplify it as the changes I did here:
      */
      
      int rand1 = bottom + (int)(Math.random()*(top-bottom));// makes random int and in range
      int rand2 = bottom + (int)(Math.random()*(top-bottom));// makes random int and in range
      int rand3 = bottom + (int)(Math.random()*(top-bottom));// makes random int and in range
      
      System.out.println (rand1);
      System.out.println (rand2);
      System.out.println (rand3);
      int minnum = Math.min(rand1,(Math.min(rand2,rand3)));// calculating the min number between the three rands
      System.out.println ("The minimal generated number was " + minnum);

   }
}
