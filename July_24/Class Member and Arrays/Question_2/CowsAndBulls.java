public class CowsAndBulls{

    //Constants
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;
    //
  
  
    // instances
    private NumberPicker randomNumber;
    private int answer;
    private int guessesCopy;
    private int bullStored;
    private int cowStored;
    //
  
    public CowsAndBulls(int seed){
          randomNumber = new NumberPicker(seed, MIN_VALUE, MAX_VALUE);
          answer = randomNumber.nextInt();
          guessesCopy = MAX_GUESSES;
          }
  
    ////////////////////////////////////////////////////////
    //Stuff between the comments is from a previous question that needs to be used in CowsAndBulls (not in a package) - I know it works as it's supposed to.
    public static int[] toArray(int number){
  
          String numString = Integer.toString(number);
          int[] someArray = new int[numString.length()];
  
          for (int i = 0; i < numString.length(); i++){
                char c = numString.charAt(i);
  
                int cVal = Character.getNumericValue(c);
  
                someArray[i] = cVal;
                }
          return someArray;
    }
  
    public static int countMatches(int a, int b) { //Bulls
        int count = 0;
    
        char[] arrayA = Integer.toString(a).toCharArray();
        char[] arrayB = Integer.toString(b).toCharArray();
    
        for (int i = 0; i < Math.min(arrayA.length,arrayB.length); i++) {
            if (arrayA[i] == arrayB[i])
                count += 1;
        }
        return count;
    }

    public static int countIntersect(int numA, int numB) { //Cows
    int count = 0;

    char[] arrayA = Integer.toString(numA).toCharArray();
    char[] arrayB = Integer.toString(numB).toCharArray();

    for (int i = 0; i < arrayA.length; i++) {
        for (int j = i; j < arrayB.length; j++) {
            if (arrayA[i] == arrayB[j]) {
                if(i != j) {
                    count++;
                }
                break;
            }
        }
    }
    return count;
    }
    //////////////////////////////////////////////////////////////////                        
  
  
  
  
  
  
    public int guessesRemaining(){
          return guessesCopy;
          }
  
  
  
    public Result guess(int guessNumber) {
    bullStored = countMatches(answer, guessNumber);
    cowStored = countIntersect(answer, guessNumber);
    guessesCopy--;
    return new Result(cowStored, bullStored);
    }
  
    public int giveUp(){
          return answer;
          }
  
          public boolean gameOver() {
            return guessesCopy == 0 || bullStored == 4;
        }

}