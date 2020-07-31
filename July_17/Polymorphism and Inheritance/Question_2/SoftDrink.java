class SoftDrink extends Food{
   
   private String flavour;
   private String bottleOrCan;
   
   public SoftDrink(String menuItemNumber, String size, String flavour, String bottleOrCan){
      super(menuItemNumber, size); 
      this.flavour = flavour;
      this. bottleOrCan = bottleOrCan;
   }
   
   public String displayList(){
      return "Soft Drink: " + super.displayList() + flavour + ", " + bottleOrCan ;
   } 
   
   public String getMenuItemNumber(){
      return super.getMenuItemNumber();
   }

}
