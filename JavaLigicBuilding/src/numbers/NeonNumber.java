package numbers;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int digit =0, originalnumber=number, addition=0, square=0;
		square=number*number;
		while(square>0)
		{
			digit=square%10;
			addition=addition+digit;
			square=square/10;
		}
		if(originalnumber==addition)
		{
			System.out.println(originalnumber + " is neaon number: ");
		}
		else
		{
			System.out.println(originalnumber + " is not neaon number: ");
		}
		sc.close();
	}

}
