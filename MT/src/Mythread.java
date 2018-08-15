
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mythread 
{

    public static void main(String[] args) 
    {
        try 
        {
            Runnable r = new Runnable1();
            Thread t = new Thread(r);
            t.start();
            Runnable r2 = new Runnable2();
            Thread t2 = new Thread(r2);
            t2.start();
            sleep(500);
        } catch (InterruptedException ex) 
        {
            Logger.getLogger(Mythread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Runnable2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            if(i%2 == 1)
                System.out.println(i);
            try 
            {
                sleep(500);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Runnable2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class Runnable1 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            if(i%2 == 0)
                System.out.println(i);
            try 
            {
                sleep(500);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Runnable1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}