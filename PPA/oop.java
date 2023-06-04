
class OOP
{
    public static void main(String ARg[])
    {
        System.out.println("Inside main function");
        Arithematic obj1=new Arithematic();
        Arithematic obj2=new Arithematic(11,10);

        int iRet=0;
        
        iRet=obj1.Addition(); //0
        System.out.println("addition is :"+iRet);

        iRet=obj1.Subtraction(); //0
        System.out.println("subtraction is :"-iRet);

        iRet=obj2.Addition(); //21
        System.out.println("addition is :"+iRet);

        iRet=obj1.Subtraction(); //1
        System.out.println("subtraction is :"-iRet);
    }
}

class Arithematic
{
    public int No1;
    public int No2;

    public Arithematic()  //Default constructur
    {
        System.out.println("Inside default constructor");
        this.No1=0;
        this.No2=0;
    }
    public Arithematic(int i,int j) //parametrised constructur
    {
        System.out.println("Inside parametrised constructor");
        this.No1=i;
        this.No2=j;
    
    }
    public Addition()
    {
        int Ans=0;
        Ans=this.No1+this.No2;
        return Ans;
    }
    public Subtraction()
    {
        int Ans=0;
        Ans=this.No1-this.No2;
        return Ans;
    }
}


