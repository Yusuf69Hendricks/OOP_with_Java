public class Food{

   private String menuItemNumber;
   private String size;
     
   public Food(String menuItemNumber, String size){
      this.menuItemNumber = menuItemNumber;
      this.size = size;      
   }
     
   public String displayList(){
      return menuItemNumber + ", " + size + ", ";
   }
     
   public String getMenuItemNumber(){
      return menuItemNumber;
   }
   
}
