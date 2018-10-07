package fopt;
public class Loop2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 1; i <=100;i++)
        {
            System.out.println(Thread.currentThread().getName() + " (" + i + ")");
        }
    }
    
    public static void main(String[] args)
    {   
        //entweder so oder wie das auskommentierte
        new Thread(new Loop2(), "Thread 1").start();
        //Loop2 l1 = new Loop2();
        Loop2 l2 = new Loop2();
        Loop2 l3 = new Loop2();
        //Thread t1 = new Thread(l1, "Thread 1");
        Thread t2 = new Thread(l2, "Thread 2");
        Thread t3 = new Thread(l3, "Thread 3");
        //t1.start();
        t2.start();
        t3.start();
    }
}