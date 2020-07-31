class TestClock{


    public static void main(String[] args){
   
      System.out.println("Testing our ClockDisplay class: ");
   
      ClockDisplay clockDisplay = new ClockDisplay(5,30);
   
    clockDisplay.tick();
   
    System.out.println(clockDisplay.getDisplayValue());
   
      System.out.println("Testing our CounterDisplay class: ");
   
      CounterDisplay counterDisplay = new CounterDisplay(3);
   
   
   
   counterDisplay.increment();
   
   counterDisplay.increment();
   
   System.out.println(counterDisplay.getDisplayValue());
   
   counterDisplay.increment();
   
   System.out.println(counterDisplay.getDisplayValue());
   
    }
   
   }