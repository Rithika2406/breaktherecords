import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int maxcount=0;
        int mincount=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                {
                    max=arr[i];
                    maxcount++;
            }
            if(arr[i]<min)
                {
                    min=arr[i];
                    mincount++;
            }}
            System.out.print(maxcount+" ");
            System.out.print(mincount);
        
    }
}