import java.io.*;
import java.util.*;
public class PhoneList
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cases=Integer.parseInt(sc.nextLine());
        for(int k=1; k<=cases; k++)
        {
            int n=Integer.parseInt(sc.nextLine());
            String phone[]=new String[n];
            boolean consistent=true;
            for(int i=0; i<n; i++)
            {
                phone[i]= sc.nextLine();
            }
            // Sort the phone numbers in alphabetical order, not numerical order.
            Arrays.sort(phone);
			// Check if a number starts with the previous number
			for(int i=1; i<n; i++)
			{
				if(phone[i].startsWith(phone[i-1]))
				{
					consistent=false;
					break;
				}
			}
		 
             
            if(consistent)
				System.out.println("YES");
            else 
				System.out.println("NO");
        }
    }
}
