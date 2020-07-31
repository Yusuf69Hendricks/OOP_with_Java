import java.util.*;
import java.util.Scanner;

public class Question2{

   public static void main(String[] args){     
      ArrayList<Food> foodList = new ArrayList<Food>();
      Scanner in = new Scanner(System.in);
      boolean check = false;
      
      System.out.println("Welcome to Great International Food Court");
      System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
      
      String input = in.nextLine();
      
      do{
         
         if (input.equals("p")){
            System.out.println("Enter the menu item number");
            String menuItemNumber = in.nextLine();
            System.out.println("Enter the size");
            String size = in.nextLine();
            System.out.println("Enter the base");
            String base = in.nextLine();
            System.out.println("Enter extra cheese");
            String extraCheese = in.nextLine();
            System.out.println("Enter extra garlic"); 
            String extraGarlic = in.nextLine();
            System.out.println("Done");
            
            Pizza pizza = new Pizza(menuItemNumber, size, base, extraCheese, extraGarlic);
            foodList.add(pizza);
         
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            input = in.nextLine();
         }
            
         if (input.equals("c")){
            System.out.println("Enter the menu item number");
            String menuItemNumber = in.nextLine();
            System.out.println("Enter the size");
            String size = in.nextLine();
            System.out.println("Enter the curry type");
            String curryType = in.nextLine();
            
            Curry curry = new Curry(menuItemNumber, size, curryType);
            foodList.add(curry);
            
            System.out.println("Done");
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            input = in.nextLine();
         
         }
         
         if (input.equals("s")){
            System.out.println("Enter the menu item number");
            String menuItemNumber = in.nextLine();
            System.out.println("Enter the size");
            String size = in.nextLine();
            System.out.println("Enter the flavour");
            String flavour = in.nextLine();
            System.out.println("Enter whether it is a bottle or can");
            String bottleOrCan = in.nextLine();
            
            SoftDrink softDrink = new SoftDrink(menuItemNumber, size, flavour, bottleOrCan);
            foodList.add(softDrink);
            
            System.out.println("Done");
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            input = in.nextLine();
         }
            
         if (input.equals("d")){
            System.out.println("Enter the menu item number");
            String menuItemNumber = in.nextLine();
                     
            for (int i = 0; i < foodList.size(); i++){
               if (foodList.get(i).getMenuItemNumber().equals(menuItemNumber)){
                  check = true;
                  foodList.remove(foodList.get(i));
               }
            }
            
            if (check == true){
               System.out.println("Done");
            }
            
            else{
               System.out.println("Not found");
            }
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            input = in.nextLine();
   
         }
         
            
           
                              
         if (input.equals("l")){
            for(Food menuItem: foodList){
               System.out.println(menuItem.displayList());
            } 
            
            System.out.println("Done");
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
            input = in.nextLine();
            
         }
         
         if (input.equals("q")){
            break;
         }
      }while(input != "q");
      
      in.close();
   }
  
}
