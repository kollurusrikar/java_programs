import java.util.*;
public class pattern
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int range=input.nextInt();
        int i,j;
        for(i=1;i<=range;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println(j);
            }
            System.out.println(" ");
        }
    }
}