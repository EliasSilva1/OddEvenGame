import java.util.Scanner;
import java.util.Random;

public class OddEvenGame {
	
	public static void main(String[] args)
	{
		
		Scanner x = new Scanner(System.in);
		int input,game,replay,win_percent, win = 0, lose = 0, odd = 0, even = 0, count = 1;
		
		do
		{
		int[] roll;
		roll = new int [6];
		
		roll[0] = 1;
		roll[1] = 2;
		roll[2] = 3;
		roll[3] = 4;
		roll[4] = 5;
		roll[5] = 6;
		
		System.out.println("Enter Odd(1) or Even(2)");
		input = x.nextInt();
		
		game = new Random().nextInt(roll.length)+1;
		
		if(game%2 == 0)
			even = even +1;
		else 
			odd = odd + 1;
		
		if (game%2== 0 && input == 2)
		{
			System.out.println("You win!");
			win = win+1;
		}
		else 
		{
			System.out.println("You lose!");
			lose = lose+1;
		}
		win_percent =  win/count;
		System.out.printf("You played %d games\n",count);
		System.out.printf("You generated %d Odds and generated %d Evens\n",odd,even);
		System.out.printf("You won %d percent\n",win_percent);
		
		System.out.println("Do you wanto play again? Yes(0) or N0 (1)");
		replay = x.nextInt();
		count++;
		}while(replay == 0);
	}
}

//		if(game%2 == 0)  ....		if (game%2== 0 && input == 2)
