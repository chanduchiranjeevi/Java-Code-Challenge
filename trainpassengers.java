import java.io.*;
import java.util.*;
public class SolB
{
    public static void main(String args[])
    {
		// Taking the initial input
        Scanner sc=new Scanner(System.in);
        int capacity= sc.nextInt();
        int stops= sc.nextInt();
        int passengers=0;
        boolean possible=true;
        
		// Taking the passenger input at each stop
        for(int i=1; i<=stops; i++)
        {
            int left=sc.nextInt();
            passengers-=left;
			// Invalid if negative no. of passengers
            if(passengers<0)
            {
                possible=false;
                break;
            }
            int entered=sc.nextInt();
            passengers+=entered;
			// Invalid if passengers are more than capacity
            if(passengers>capacity)
            {
                possible=false;
                break;
            }
            int stayed =sc.nextInt();
			// Invalid if people wait in stop when train is not full
            if(passengers<capacity && stayed>0)
            {
                possible=false;
                break;
            }
			// Invalid if people are waiting or are still on train in last stop
            if(i==stops&&stayed>0)
            {
                possible=false;
                break;
            }
            if(i==stops&&passengers>0)
            {
                possible=false;
                break;
            }
        }
        // It is possible if none of the invalidations occur
        if(possible)
        System.out.println("possible");
        else
        System.out.println("impossible");
    }
}
