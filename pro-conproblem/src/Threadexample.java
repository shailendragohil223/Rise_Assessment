import java.util.LinkedList;
 
public class Threadexample
{
    public static void main(String[] args)
                        throws InterruptedException
    {
        final PC pc = new PC();
 
        Thread t1 = new Thread(() -> 
        {
            try
            {
                pc.produce();
            }
            catch(InterruptedException e)
            {
            }
        });
 
        Thread t2 = new Thread(() -> {
            try
            {
                pc.consume();
            }
            catch(InterruptedException e)
            {
            }
        });
 
        t1.start();
        t2.start();
        Thread.sleep(500);
 
        t1.join();
        t2.join();
    }
    
    public static class PC
    {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
 
     
        public void produce() throws InterruptedException
        {
            int value = 1;
            while (true)
            {
                synchronized (this)
                {
                    while (list.size()==capacity)
                        wait();
 
                    System.out.println("Producer produced the itmes : "
                                                  + value);
                    list.add(value++);
 
                    notify();
                    Thread.sleep(500);
                }
            }
        }
        public void consume() throws InterruptedException
        {
            while (true)
            {
                synchronized (this)
                {
                    while (list.isEmpty())
                        wait();
                    int val = list.removeFirst();
 
                    System.out.println("Consumer consumed the itmes : "
                                                    + val);
                    
                    notify();
                    Thread.sleep(500);
                }
            }
        }
    }
}