import java.util.Scanner;

public class ForLoops
	{

		public static void main(String[] args)
			{
//				challengeOne();
//				challengeTwo();
//				challengeThree();
//				challengeFour();
//				challengeFive();
				challengeSix();
				challengeSeven();
				challengeEight();
			}
		
		public static void challengeOne()
		{
			for(int i = 0; i <= 5 ; i++)
				{
					System.out.println(i);
				}
		}
		
		public static void challengeTwo()
		{
			for (int i = 2; i <= 10; i = i + 2)
				{
					System.out.println("(" + i + "). I love Mullen!");
				}
		}
		
		public static void challengeThree()
		{	
			for(int i = 0; i <= 5 ; i++)
				{
					System.out.print(i);
				}
		}
		
		public static void challengeFour()
		{
			System.out.println(" ");
			for(int i = 10; i > 0; i--)
				{
					System.out.println(i);
				}
			System.out.println("BLAST OFF!");
		}
		
		public static void challengeFive()
		{
			int totalSum = 0;
			for (int i = 5; i <= 100; i = i + 5)
				{
					totalSum = totalSum + i;
				}
			System.out.println(totalSum);
		}
		
		public static void challengeSix()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please input a number.");
			int lowerNumber = userInput.nextInt();
			System.out.println("Please input a number bigger than the previuos number.");
			int higherNumber = userInput.nextInt();
			
			for (int i = lowerNumber; i <= higherNumber; i++)
				{
					System.out.println(i);
				}
		}
		
		public static void challengeSeven()
		{
			
		}
		
		public static void challengeEight()
		{
			
		}
	}
