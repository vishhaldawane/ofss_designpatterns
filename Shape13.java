public abstract class Shape13 {//Parent
	
   protected DrawAPI drawAPI;//hasA
   
   protected Shape13(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}