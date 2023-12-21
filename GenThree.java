public class GenThree {
   public static void main (String[] args)
   {
      int bottom = Integer.parseInt(args[0]);// range bottom
      int top = Integer.parseInt(args[1]);// range top
      double rand1 = Math.random();// generates a double random 
      int int1 = bottom + (int)(rand1*(top-bottom));// makes random int and in range
      double rand2 = Math.random();// generates a double random 
      int int2 = bottom + (int)(rand2*(top-bottom));// makes random int and in range
      double rand3 = Math.random();// generates a double random 
      int int3 = bottom + (int)(rand3*(top-bottom));// makes random int and in range
      System.out.println (int1);
      System.out.println (int2);
      System.out.println (int3);
      int minnum = Math.min(int1,(Math.min(int2,int3)));// calculating the min number between the three rands
      System.out.println ("the minimal generated number was "+ minnum);

   }
}
