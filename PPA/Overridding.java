class Base
{
   public void fun()
   {System.out.println("Base fun");}
   public void gun()
   {System.out.println("Base gun");}
   public void sun()
   {System.out.println("Base sun");}
   
}
class Derived extends Base
{
    public void fun()
   {System.out.println("Base fun");}
   public void gun()
   {System.out.println("Base gun");}
   public void run()
   {System.out.println("Base run");}
}
class Overridding
{
    public static void main (String Arg[])
    {
        Base bobj=new Derived();
        bobj.fun();//derived fun
        bobj.gun();//derived gun
        bobj.sun();//base sun
        //bobj.run();//derived run
    }
}