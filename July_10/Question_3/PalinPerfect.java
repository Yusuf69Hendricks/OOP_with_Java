import java.util.Scanner;

public class PalinPerfect {

	public static void main(String[] args){

		Scanner user_input = new Scanner(System.in);
		String start_point;
	
		System.out.print("Enter start point N:\n");
	
		start_point = user_input.next();
		int start = Integer.parseInt(start_point);
	
		String finish_point;
		System.out.print("Enter ending point M:\n");
	
		finish_point = user_input.next();
		int finish = Integer.parseInt(finish_point);
		System.out.print( "The palindromic perfect squares are as follows:\n");
	
		for(int i = (int)Math.ceil(Math.sqrt(start)); i * i <= finish; i++){
			int number = i * i;
			int Rnumber = 0;
			int temp = 0;
			while(number > 0){
				temp = number % 10;
				number = number / 10;
				Rnumber = Rnumber * 10 + temp;
			}
			if(i * i == Rnumber)
				System.out.println(Rnumber);
		}

		user_input.close();
	}
}
