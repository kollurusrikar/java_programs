import java.util.*;
public class type{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=input.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if(a<0){
            System.out.println("negative number");
        }
        else
        {
            System.out.println("it is 0");
        }
        input.close();
    }

}