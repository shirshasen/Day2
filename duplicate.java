package day2;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
		int n,i,j,k=0,flag=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n= sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		System.out.println("Enter elements");
	    for(i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }      
	    for (i = 0; i < arr.length; i++)   
		{  
			for (j=i+1; j<arr.length; j++)   
			{  
				 flag = 0;  
				if (arr[i] > arr[j])   
				{  
					flag = arr[i];  
					arr[i] = arr[j];  
					arr[j] = flag;  
				}  
			} 
		}
		for(i = 0; i <(arr.length-1); i++)
		{
			if(arr[i]!=arr[i+1])
				{
					arr1[k]=arr[i];
					k++;
				}
			
		}
		arr1[k]=arr[5-1];
		for(i = 0; i < arr.length; i++)
			System.out.println(arr1[i]);
		
}
}
	

