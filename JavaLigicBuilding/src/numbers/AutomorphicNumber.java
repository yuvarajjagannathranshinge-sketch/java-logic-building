package numbers;
import java.util.Scanner;
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		int num=number, square=0,number1=0,number2=0,count=0, count2=0,originalnum=number;
		square=number*number;
		while(number>0)
		{
			count++;
			number=number/10;
		}
		while(square>0)
		{	
			number1=square%10;
			number2=originalnum%10;
			if(number1==number2)
			{
				count2++;
			}
			square=square/10;
			originalnum=originalnum/10;
			if(count==count2)
			break;	
		}
			if(count==count2)
			{
				System.out.print(num + " is Automorphic number");
			}
			else
			{
				System.out.print(num + " not is Automorphic number");
			}
			sc.close();
	}

}
