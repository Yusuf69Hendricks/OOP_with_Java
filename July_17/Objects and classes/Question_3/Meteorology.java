import java.util.*;

public class Meteorology
{   
    
    public static void menu()
    {
        System.out.println("Make a selection and press return:");
        System.out.println("1. Record a temperature reading");
        System.out.println("2. Record a pressure reading");
        System.out.println("3. Record a humidity reading");
        System.out.println("4. Print Maximum values");
        System.out.println("5. Print Minimum Values");
        System.out.println("6. Print Average Values");
        System.out.println("7. Quit");
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        Collator tCollator = new Collator("Temperature");
        Collator pCollator = new Collator("Pressure");
        Collator hCollator = new Collator("Humidity");
        
        do{
            menu();
            ch = Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1: 
                    {
                        System.out.println("Enter value:");
                        int x = Integer.parseInt(sc.nextLine());
                        tCollator.recordReading(x);
                        break;
                    }
                case 2: 
                    {
                        System.out.println("Enter value:");
                        int x = Integer.parseInt(sc.nextLine());
                        pCollator.recordReading(x);
                        break;
                    }
                case 3: 
                    {
                        System.out.println("Enter value:");
                        int x = Integer.parseInt(sc.nextLine());
                        hCollator.recordReading(x);
                        break;
                    }
                case 4:
                    {
                        String t="-",p="-",h="-";
                        int max1,max2,max3;
                        max1= tCollator.maximum();
                        max2= pCollator.maximum();
                        max3= hCollator.maximum();
                        if(max1!=0)
                            t = "" + max1;
                        if(max2!=0)
                            t = "" + max2;
                        if(max3!=0)
                            t = "" + max3;
                        System.out.println("maximum temperature: " + t);
                        System.out.println("maximum pressure: " + p);
                        System.out.println("maximum humidity: " + h);
                        break;
                    }
                case 5:
                    {
                        String t="-",p="-",h="-";
                        int min1,min2,min3;
                        min1= tCollator.minimum();
                        min2= pCollator.minimum();
                        min3= hCollator.minimum();
                        if(min1!=0)
                            t = "" + min1;
                        if(min2!=0)
                            p = "" + min2;
                        if(min3!=0)
                            h = "" + min3;
                        System.out.println("maximum temperature: " + t);
                        System.out.println("maximum pressure: " + p);
                        System.out.println("maximum humidity: " + h);
                        break;
                    }
                case 6:
                    {
                        String t="-",p="-",h="-";
                        double avg1,avg2,avg3;
                        avg1= tCollator.average();
                        avg2= pCollator.average();
                        avg3= hCollator.average();
                        if(avg1!=0)
                            t = String.format("%.2f",avg1) ;
                        if(avg2!=0)
                            p = String.format("%.2f",avg2);
                        if(avg3!=0)
                            h = String.format("%.2f",avg3);
                        System.out.println("maximum temperature: "+ t);
                        System.out.println("maximum pressure: "+ p);
                        System.out.println("maximum humidity: "+ h);
                        break;
                    }
                case 7:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(ch!=7);

        sc.close();
    }
}