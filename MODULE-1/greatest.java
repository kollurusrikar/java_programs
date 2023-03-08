import java.util.*;
public class greatest
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("a is greatest");
        }
        else if(b>c&&b>a)
        {
            System.out.println("b is greatest");
        }
        else
        {
            System.out.println(" c  is greatest");
        }
        input.close();

    }
    
}