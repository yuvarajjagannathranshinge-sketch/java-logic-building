package numbers;
import java.util.Scanner;
public class AutomorphicNumberLogic2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		int digit=0, originalnum=number, square=0, count=0;
		square=number*number;
		while(number>0)
		{
			//digit=number%10;
			count++;
			number=number/10;
		}
		digit=square%(int)Math.pow(10, count);
		if(digit==originalnum)
		{
			System.out.print(originalnum + " is Automorphic number");
		}
		else 
		{
			System.out.print(originalnum + " is not Automorphic number");
		}
		sc.close();
	}

}
