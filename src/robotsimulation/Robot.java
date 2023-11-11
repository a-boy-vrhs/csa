package robotsimulation;


import java.util.Random;   // for predictable random numbers

public class Robot  
{  
   /** Distance, in inches, from the starting position to the goal. */  
   private int goalDistance;  
   /** Maximum number of moves allowed to reach the goal. */ 
   private int maxMoves;  
   
   Random random = new Random(27000);  // predictable random numbers

   /** Constructs a default Robot object which is 100 inches, from the starting  
     * position to the goal, and with 10 maximum number of moves allowed to reach the
     * goal.  
   */ 
   public Robot()  
   {  
      goalDistance = 100;  
      maxMoves = 10;  
   }  

   /** Constructs a Robot object where dist is the distance, in inches, from the starting  
     * position to the goal, and maxMoves is the maximum number of moves allowed to reach the
     * goal.  
     * Precondition: dist > 0; maxMoves > 0  
   */  
    public Robot(int dist, int numMoves)  
    {  
       goalDistance = dist;  
       maxMoves = numMoves;  
    }

   /** Returns an integer representing the distance, in inches, to be moved when the robot moves. 
    *  The integer returned is a random integer between -6 and 20 (inclusive).
   */  
   public int moveDistance()  
   { /* to be implemented in part (a) */   
	   double randNum = random.nextFloat();
	   return (int)(randNum*27)-6;
   }
     
   /** Simulates a robot attempting to reach the goal as described in part (b).  
     * Returns true if the robot successfully reached or passed the goal during the simulation;  
     * false otherwise.  
   */ 
   public boolean simulate(boolean printInfo)  
   { /* to be implemented in part (b) */  
	   int total = 0;
	   String info = "";
	   int nextMove = 0;
	   
	   if(printInfo) {
		   for(int i=0; i<maxMoves; i++) {
			   nextMove = moveDistance();
			   info += total+"("+nextMove+")";
			   total += nextMove;
		   }
	   }else {
		   for(int i=0; i<maxMoves; i++) {
			   nextMove = moveDistance();
			   total += nextMove;
		   }
	   }
	   System.out.println(info);
	   return total >= goalDistance;
   } 
   
   /** Runs num simulations and returns the proportion of simulations in which the robot 
     * successfully reached or passed the goal.  
     * Precondition: num > 0  
   */ 
   public double runSimulations(int num)  
   { /* to be implemented in part (c) */ 
	   double passes = 0;
	   for(int i=0; i<num; i++) {
		   if(simulate(false)) {
			   passes++;
		   }
	   }
	   return passes / num;
   }  
} 
