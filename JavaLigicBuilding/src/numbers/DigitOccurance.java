package numbers;
import java.util.Scanner;
public class DigitOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a main number: ");
		int num=sc.nextInt();
		System.out.print("Enter a digit number: ");
		int digitnum=sc.nextInt();
		
		int digit=0,count=0;
		while(num>0)
		{
			digit=num%10;
			if(digit==digitnum)
			{
				count++;
			}
			num=num/10;
		}
		System.out.print(digitnum + " present " + count + " times.");
		sc.close();

	}

}
