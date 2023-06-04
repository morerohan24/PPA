import java.util.*;

class input
{
    public static void main(String Args[])
    {
         Scanner sobj=new Scanner(System.in);

         System.out.println("enter first number:");
         int iNo1=sobj.nextInt();

         System.out.println("enter second number:");
         int iNo2=sobj.nextInt();

         int iAns=0;
         iAns=iNo1+iNo2;
         System.out.println("addition is:"+iAns);
         
         sobj.close();
    }
}