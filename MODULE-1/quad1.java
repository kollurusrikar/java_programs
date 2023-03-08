import java.util.*;
import java.lang.Math;
public class quad1
{
    public static void main(String args[])
    {
        int a,b,c;
        double dis,x1,x2;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        dis=b*b-4*a*c;
        if(dis>0)
        {
            x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
            x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println("the roots are"+x1+" "+x2);
        }
        else if(dis==0)
        {
            x1=x2=-b/2*a;
            System.out.println("the roots are"+x1+" "+x2);
        }
        else{
            System.out.println("the rooots are imaginary");
        }
        input.close();
        
    }
}