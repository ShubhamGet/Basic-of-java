import java.util.Scanner;
class TransposeMatrix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int [][] a=new int [3][3];
		int [][] at=new int [3][3];
		int i,j;
		System.out.println("Enter Array elements:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				at[i][j]=a[i][j];
			}
		}
		
		System.out.print("Entered elements:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println("");
		}
		
		System.out.println("Transpose Element:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(at[j][i]+"");
			}
			System.out.println("");
		}
	}
}
