import java.util.Scanner;
class Check
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		int temp;
		int sum=0;
		int ld=0;
		System.out.println("Enter number:");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			ld=num%10;
			num=num/10;
			sum=sum+(ld*ld*ld);
		}
		if(temp==sum)
		{
			System.out.print(sum+ "is a armstrong number");
		}
		else
		{
			System.out.print(sum+ "isn't a armstrong number");
		}
	}
}
