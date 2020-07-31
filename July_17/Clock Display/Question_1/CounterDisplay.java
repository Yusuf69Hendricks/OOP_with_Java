import java.text.*;


class CounterDisplay{

 

 private int limit;

 private int value;






 public CounterDisplay(int pLimit){

   value = 0;

   limit = pLimit;

 }



 public void setValue(int pValue){

   value = pValue;

 }



 public int getValue(){

   return value;

 }



 public void increment(){

   value = value+1;

  
   if(value == limit)

      value = 0;

 }


 public String getDisplayValue(){

   NumberFormat myFormat = new DecimalFormat("00");

   String s = myFormat.format(value);

   return s;

 }



}