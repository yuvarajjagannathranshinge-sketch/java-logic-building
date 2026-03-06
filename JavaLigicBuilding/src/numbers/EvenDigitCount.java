package numbers;
import java.util.Scanner;
public class EvenDigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int Num=sc.nextInt(), digit=0, count=0;
		while(Num>0)
		{
			digit=Num%10;
			if(digit%2==0)
			{
				count++;
			}
			Num=Num/10;
		}
		System.out.print(count + " even digit present in the number.");
		sc.close();
	}

}
