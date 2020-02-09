import java.lang.*;
class asc extends Thread
{
public void run()
{
System.out.println("hi");
}
}
class zxc extends Thread
{
public void run()
{
System.out.println("aditya");
}
}
class asd extends Thread
{
public void run()
{
System.out.println("chavan");
}
}
class aditya 
{ 
    public static void main(String ar[])
    {    
     asc a1=new asc();
     asd a2=new asd();
     zxc a3=new zxc();
     a1.start();
     a2.start();
     a3.start();
    }
    
}
