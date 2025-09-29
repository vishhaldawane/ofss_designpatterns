public abstract class Game {
   
	//mandate for all the games 
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();
   abstract void toss();
   abstract void declareWinner();
   
   
   //template method - to govern the business logic (sequential flow)
   public final void play(Game g ){

	 //  if(g instanceof FootBall) {
		//   FootBall fb = (FootBall) g;
		//   fb.penalty();
	  // }
	   
      //initialize the game
      initialize(); //1
      
      //toss the game
      toss(); //2
      

      //start game
      startPlay(); //3
      
      
      //declare the winner of the game
      declareWinner(); //4
      
      //end game
      endPlay(); //5
     
   }
}