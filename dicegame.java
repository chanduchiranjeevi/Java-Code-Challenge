import java.io.*;
import java.util.*;

public class SolA
{
    public static void main(String args[])
    {
		// Take input
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int a3=sc.nextInt();
        int b3=sc.nextInt();
        int a4=sc.nextInt();
        int b4=sc.nextInt();
        // calculate the sum of the dice numbers
        int sum1= a1+b1+a2+b2;
        int sum2= a3+b3+a4+b4;
		
        if(sum1>sum2)
			System.out.println("Gunnar");
        else if(sum1 == sum2)
			System.out.println("tie");
        else 
			System.out.println("Emma");
    }
}