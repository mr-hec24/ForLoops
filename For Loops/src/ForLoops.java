
public class ForLoops
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
				challengeFour();
				challengeFive();
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
	}