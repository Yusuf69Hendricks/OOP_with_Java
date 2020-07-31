public class TestJumpRecord{
   private TestJumpRecord(){}
   
   public static void main(final String[] args) {
      
      
      System.out.println("Test 1");
      JumpRecord X = new JumpRecord();
      X.recordJump(4.2);
      if (X.jumps() == 1){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }
      
      
      System.out.println("Test 2");
      X.recordJump(5.3);
      if (X.jumps()== 2 && X.getLongest() == 2){
         System.out.println("Pass");
      }
      else {
         System.out.println("Fail");
      }
      
      System.out.println("Test 3");
      X.recordJump(6.5);
      if ( X.jumps() == 3
         &&  X.getLongest() == 3
         &&  X.finished() ){
         System.out.println("Pass");
      }
      else{
      System.out.println("Fail");
      }
      
      System.out.println("Test 4");
      JumpRecord Y = new JumpRecord();
      Y.recordFoulJump();
      if( Y.foulJumps() == 1){
         System.out.println("Pass");
         
      }
      else{
         System.out.println("Fail");
      }
      
      System.out.println("Test 5");
      int i = X.getLongest();
      if (X.jumps() == 3
         && i == 3
         && X.finished()
         && X.foulJumps()==0){
         System.out.println("Pass");
      }
      else {
         System.out.println("Fail");
      }
      
      
      System.out.println("Test 6");
      JumpRecord a = new JumpRecord();
      if(a.maxJumps() == 3){
         System.out.println("Pass");
      }
      
      else{
         System.out.println("Fail");
      }
      
      System.out.println("Test 7");
      a.recordFoulJump();
      a.recordFoulJump();
      a.recordFoulJump();
      if (a.foulJumps() == 3 && a.finished()){
         System.out.println("Pass");
      }
      else {
         System.out.println("Fail");
      }
      
      System.out.println("Test 8");
      JumpRecord F = new JumpRecord();
      F.recordJump(4.5);
      F.recordFoulJump();
      F.recordJump(4.2);
      int f = F.getLongest();
      if (F.jumps() == 3 && f == 1 && F.isFoulJump(2)&& F.finished()&& F.foulJumps() == 1  ){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }
      
      System.out.println("Test 9");
      if (F.getJumpDistance(1) == 4.5){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }
     
      System.out.println("Test 10");
      if(F.getJumpDistance(2) == 0){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }
     
      System.out.println("Test 11");
      JumpRecord G = new JumpRecord();
      G.recordJump(4.8);
      G.recordJump(4.8);
      G.recordJump(4.7);
      int g = G.getLongest();
      if(g == 1 && G.jumps() == 3 && G.finished()){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }
     
      System.out.println("Test 12");
      JumpRecord L = new JumpRecord();
      L.recordFoulJump();
      L.recordFoulJump();
      L.recordFoulJump();
      if(L.jumps() == 3 && L.finished()){
         System.out.println("Pass");
      }
      else{
         System.out.println("Fail");
      }    
    
   }

}