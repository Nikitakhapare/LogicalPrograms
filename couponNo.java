package com.Bridgelabz.LgicalProgram;

public class CouponNo {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many coupon codes you need: ");
		int N=sc.nextInt();

		int[] arr = new int[N];
		int max = 100, min = 999;
		int index = 0,flag = 0;int i;
		for( i=0;index<N;i++)
		{
			flag=0;
			int rand = (int) (Math.random() * (max - min + 1)) + min;
			for(int j=0;j<index;j++)
			{
				if(arr[j]==rand)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				arr[index]=rand;
				index++;
			}

		}

		for(i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}




