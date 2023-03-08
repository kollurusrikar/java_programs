import java.util.*;
public class average
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int e=input.nextInt();
        int average,sum;
        average=(a+b+c+d+e)/5;
        sum=a+b+c+d+e;
        System.out.println("average is "+average);
        System.out.println("sum is "+sum);
        input.close();
    }

}