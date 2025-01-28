import java.util.Scanner;
public class Reverse{
		public static void main(String args[]){
		int n,sum=0,rem;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		n = s. nextInt();
		s.close();
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum*10+rem;
		}
		System.out.println(sum);
	}
}


