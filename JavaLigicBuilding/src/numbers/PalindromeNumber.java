package numbers;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int OrgNumber=sc.nextInt();
		int Num=OrgNumber;
		int digit=0, rev=0;
		
		while(OrgNumber>0)
		{
			digit=OrgNumber%10;
			rev=rev*10+digit;
			OrgNumber=OrgNumber/10;
		}
		if(Num==rev)
		{
			System.out.print(rev+" "+"is palindrom number.");
		}
		else
		{
			System.out.print(rev+" "+"is not palindrom number.");
		}
		sc.close();

	}

}
