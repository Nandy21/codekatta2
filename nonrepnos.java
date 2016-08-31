import java.util.Arrays;
import java.util.Scanner;


public class nonrepeatednos {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i]);
			}
		}
		
				
			
		}


	}


