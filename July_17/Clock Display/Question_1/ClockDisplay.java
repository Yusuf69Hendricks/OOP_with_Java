

class ClockDisplay{

 private CounterDisplay hours;

 private CounterDisplay minutes;


 public ClockDisplay(int pHours, int pMinutes){

   hours = new CounterDisplay(24); 
   hours.setValue(pHours);

   minutes = new CounterDisplay(60); 

   minutes.setValue(pMinutes);

 }

 public void setTime(int pHours, int pMinutes){

   hours.setValue(pHours); 

   minutes.setValue(pMinutes); 

 }

public void tick(){

 minutes.increment(); 

 if(minutes.getDisplayValue() == "00")

    hours.increment();

}

public String getDisplayValue(){

 String hh = hours.getDisplayValue();

 String mm = minutes.getDisplayValue();

 String time = hh+" : "+mm;

 return time;

}

}