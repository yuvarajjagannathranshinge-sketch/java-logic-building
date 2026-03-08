package numbers;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int sum=0;
		for(int i=1;i<28;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}	
		}
		if(sum==number)
		{
			System.out.print(number + " is perfect number");
		}
		else
		{
			System.out.print(number + " is not perfect number");
		}
		sc.close();
	}

}
