package numbers;
import java.util.Scanner;
public class DigitPresenceCheck 
	{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		System.out.print("Enter a number you want to check: ");
		int checknum=sc.nextInt();
		int digit=0;
		boolean isPresent=false;
		while(num>0)
		{
			digit=num%10;
			if(digit==checknum)
			{
				isPresent=true;
			}
			num=num/10;
		}
		if(isPresent==true)
		{
			System.out.print(checknum + " is present");
		}
		else
		{
			System.out.print(checknum + " is not present.");
		}
		sc.close();

	}

}
