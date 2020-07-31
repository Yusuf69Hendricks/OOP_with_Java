public class Pizza extends Food{

   private String base;
   private String extraCheese;
   private String extraGarlic;
   
     
   public Pizza(String menuItemNumber, String size, String base, String extraCheese, String extraGarlic){
      super(menuItemNumber, size);
      this.base = base;
      this.extraCheese = extraCheese;
      this.extraGarlic = extraGarlic;
   }
      
   public String displayList(){
      return "Pizza: " + super.displayList() + base + ", " + extraCheese + ", " + extraGarlic;
   }
   
   public String getMenuItemNumber(){
      return super.getMenuItemNumber();
   }

}