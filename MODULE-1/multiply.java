import java.util.*;
public class multiply
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=input.nextInt();
        System.out.println("enter range: ");
        int range=input.nextInt();
        int i,result;
        input.close();
        for(i=1;i<=range;i++)
        {
            result=num*i;
            System.out.println(num+"*"+i+"="+result);
        }
        
    }
}