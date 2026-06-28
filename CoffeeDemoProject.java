package mohan;

import java.util.Scanner;

public class CoffeeDemoProject 
{
	public static void main(String[] args) 
	{
		String smile="\uD83D\uDE00";
		String coffee= "\u2615";
		String rupee = "\u20B9";
		int bill=0;
				
		System.out.println("******************************");
		System.out.println(coffee+ " WELCOME TO MOHAN COFFEE CAFE " +coffee);
		System.out.println("******************************");
		
		System.out.println("1. Espresso - "+rupee+ "200");
		System.out.println("2. Cappucccino - "+rupee+ "250" );
		System.out.println("3. Latte - "+rupee+ "300" );
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose your coffee: ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			bill=bill+200;
		}
		else if(choice==2)
		{
			bill=bill+250;
		}
		else if(choice==3)
		{
			bill=bill+300;
		}
		else
		{
			System.out.println("Invalid choice!");
		}
		if(bill>0)
		{
			
			System.out.println("Add whipped cream for"+rupee+"30?(yes=1/no=0)");
			int whippedCreamChoice=sc.nextInt();
			
			if(whippedCreamChoice==1)
			{
				bill=bill+30;
			}
			
			System.out.println("Add a flavour shot?(Vanilla for"+rupee+"20 or Hazelnut for"+rupee+"25) (yes=1/no=2) ");
			
			int flavour=sc.nextInt();
			if(flavour==1)
			{
				System.out.println("Which one?(Enter 1 for Vanilla & 2 for Hazelnut)");
				int flavourChoice=sc.nextInt();
				if(flavourChoice==1)
				{
					bill=bill+20;
				}
				else if(flavourChoice==2)
				{
					bill=bill+25;
				}
				else
				{
					System.out.println("Invalid number!");
				}
				
			}
			System.out.println("Total Bill:"+rupee+""+bill);
			System.out.println("Thank you! "+smile);
		}
		
	}

}
