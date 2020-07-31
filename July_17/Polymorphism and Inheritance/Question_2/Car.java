public class Car extends Vehicle{
   
   private int numberOfDoors;
   
   public Car(String colour, int numberOfPassengers, int doors){
      super(numberOfPassengers, colour);
      this.numberOfDoors = doors;   
   }    
   
   public String toString(){
      return super.toString() + " "  + numberOfDoors + " doors";
   }       
}