import java.awt.*;
import java.awt.event.*;

class Calulator1
{
    public static void main(String Arg[])
    {
        MarvellousCalulator mobj =new MarvellousCalulator(400,400,"Marvellous");
    }
}

class MarvellousCalulator extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    public Integer No1,No2;
      
    public MarvellousCalulator(int width,int height,String title)
    {
        fobj = new Frame(title);
        fobj.setSize(width,height);
        
        fobj.addWindowListener(this);

        b1=new Button("ADD");
        b2=new Button("SUB");
        b3=new Button("MULT");
        b4=new Button("DIV");

        t1=new TextField();
        t2=new TextField();

        b1.setBounds(10,280,80,40); //x,y,w,h
        b2.setBounds(100,280,80,40); //x,y,w,h
        b3.setBounds(190,280,80,40); //x,y,w,h
        b4.setBounds(290,280,80,40); //x,y,w,h

        t1.setBounds(70,100,100,40)//x,y,w,h
        t2.setBounds(220,100,100,40);//x,y,w,h

          fobj.add(b1);
          fobj.sub(b2);
          fobj.mul(b3);
          fobj.div(b4);

          fobj.add(t1);
          fobj.add(t2);

          lobj= new Label();

          lobj.setBounds(150,25,200,100); //x,y,w,h
          fobj.add(lobj);

          b1.addActionListener(this);
          b2.subActionListener(this);
          b3.mulActionListener(this);
          b4.divActionListener(this);

          fobj.setLayout(null);
          fobj.setVisible(true);
    }
    public void windowClosing(WindowEvent obj) //Event handler for frame
    {
        System.exit(0);
    }    
    
    public void actionPerformed(ActionEvent aobj) //event handler for buttons
    {
        try
        {
            No1=Integer.praselnt(t1.get Text());
            No2=Integer.praselnt(t2.get Text());

            if(aobj.getSource()==b1) //add
            {
                lobj.setText("Addition is : "+(No1+No2));
            }
            else if(aobj.getSource()==b2) //sub
            {
                lobj.setText("subtraction is : "+(No1-No2));
            }
            else if(aobj.getSource()==b3) //mul
            {
                lobj.setText("Multiplication is : "+(No1*No2));
            }
            else if(aobj.getSource()==b4) //div
            {
                lobj.setText("Division is : "+(No1/No2));
            }
        }
        catch(Exception eobj)
        {}
    }
}