package numbers;
import java.util.Scanner;
public class ReverseOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int Number = sc.nextInt();
		
		int rev=0;
		int digit=0;
		
		while(Number>0)
		{
			digit=Number%10;
			rev=rev*10+digit;
			Number=Number/10;
		}
		
		System.out.print("Reverse of number : " +rev);
		sc.close();
	}

}
