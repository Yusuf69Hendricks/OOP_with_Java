import java.util.*;


class NumberUtils{


private NumberUtils() {}

 public static int[] toArray(int number){

 int temp = number;

 int digits=0;

 while(temp>0){

   temp = temp/10;

   digits++;

 }

 int array[] = new int[digits];

 temp = number;


 for(int i=0;i<digits;i++){

   array[digits-1-i] = temp%10;

   temp = temp/10;

 }

 return array;

 }

 public static int countMatches(int numberA, int numberB){

  int arrayA[] = toArray(numberA);

  int arrayB[] = toArray(numberB);

  int matches = 0;

  int size; 

  if(arrayA.length < arrayB.length)

    size = arrayA.length;

  else

     size = arrayB.length;

  for(int i=0;i<size;i++){

    if(arrayA[i] == arrayB[i])

       matches++;

  }

  return matches;

 }

 public static int countIntersect(int numberA, int numberB){

   int arrayA[] = toArray(numberA);

   int arrayB[] = toArray(numberB);

   int matches = 0;

  for(int i=0;i<arrayA.length;i++){

    for(int j=0;j<arrayB.length;j++){

      if(arrayA[i] == arrayB[j]){

        matches++;

        break;

      }

    }

  }

return matches;

 }
 public static void main(String[] args) {
    NumberUtils numberutils = new NumberUtils();
    int[] G = numberutils.toArray(5678);
    System.out.println(Arrays.toString(G));
    System.out.println(numberutils.countMatches(39628, 97324));
    System.out.println(numberutils.countIntersect(39624, 97324)); 
  }



}