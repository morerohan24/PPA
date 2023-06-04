
class Array2
{
    public static void main (String Arg[])
    {
        int Arr[][]=new int[3][4];

        Arr[0][0]=10;
        Arr[0][1]=20;
        Arr[0][2]=30;
        Arr[0][3]=40;

        Arr[1][0]=50;
        Arr[1][1]=60;
        Arr[1][2]=70;
        Arr[1][3]=80;
        
        Arr[2][0]=90;
        Arr[2][1]=10;
        Arr[2][2]=10;
        Arr[2][3]=10;

        System.out.println(Arr.Length);   //3
        System.out.println(Arr[0].Length);   //3
        System.out.println(Arr[1].Length);   //3
        System.out.println(Arr[2].Length);   //3
    } 
}