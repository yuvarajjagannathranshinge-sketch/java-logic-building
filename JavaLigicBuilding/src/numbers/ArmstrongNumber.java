package numbers;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int digit=0,arnum=0,count=0,orgnum=num;
		while(num>0)
		{
			digit=num%10;
			//arnum=arnum+(digit*digit*digit);
			count++;
			num=num/10;
		}
		arnum=arnum+(digit*digit*digit);
		if(orgnum==arnum)
		{
			System.out.print(orgnum + " is ArmstrongNumber");
		}
		else
		{
			System.out.print(num + " is not ArmstrongNumber");
		}
		sc.close();
	}

}
