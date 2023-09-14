import java.util.Scanner;
public class B
{
    public static void main(String args[])
    {
        Scanner scl = new Scanner(System.in);
        int t = scl.nextInt();
        while (t-->0)
        {
            int n = scl.nextInt();
            char ch[]=scl.next().toCharArray();
            int q=0, a=0;
            for(int i=0; i<n; i++)
            {
                if(ch[i]=='Q')q++;
                else q=Math.max(0, q-1);
            }
            if(q==0)System.out.println("Yes");
            else System.out.println("No");
        }

    }
}