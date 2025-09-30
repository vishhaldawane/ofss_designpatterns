public class Context { //player
   private Strategy strategy;//hasA -  a particular bat to play

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);// we don't know the strategy
   }
}