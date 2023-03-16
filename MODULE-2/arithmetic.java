public class arithmetic
{
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    void add()
    {
        int addition=a+b;
        System.out.println(addition);
    }
    void subtract()
    {
        int subtract=a-b;
        System.out.println(subtract);
    }
    void divide()
    {
        int division=a/b;
        System.out.println(division);
    }
    void multiply()
    {
        int multiplication=a*b;
        System.out.println(multiplication);
    }
    public static void main(String args[])
    {
        arith a1=new arith();
        a1.add();
        a1.subtract();
        a1.divide();
        a1.multiply();
    }
}