import java.util.*;
class EvenOdd
{
	public static void main(String[] args)
	{
		int arr[]={2,3,7,9,8,6,15,16,20,50,45,40,60,70,20,5,22,26,32,36};
		int even=0;
		int odd=0;
		for(int i=0;i<20;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Content of the array \n");
		for(int i=0;i<20;i++)
		{
			System.out.println(arr[i]+" " );
		}
		System.out.println("Total number of even is "+even);
		System.out.println("Total number of odd is "+odd);
	}
}

		