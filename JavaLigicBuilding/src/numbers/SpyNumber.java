package numbers;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt(), orgnum=num;
		int addi =0, mul=1, digit=0;
		while(num>0)
		{
			digit=num%10;
			addi=addi+digit;
			mul=mul*digit;
			num=num/10;
		}
		if(addi==mul)
		{
			System.out.print(orgnum + " is spy number.");
		}
		else
		{
			System.out.print(orgnum + " is not spy number.");
		}
		sc.close();
	}

}
