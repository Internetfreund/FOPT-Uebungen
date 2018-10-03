package fopt;

public class Loop1 implements Runnable
{
    private String myName;
    
    public Loop1(String name)
    {
        myName = name;
    }
    
    public void run()
    {
        for(int i=1; i<=100;i++)
        {
            System.out.println(myName + " (" + i + ")");
        }
    }

    public static void main(String[] args)
    {
        //so
        new Thread(new Loop2("Thread 1")).start();
        new Thread(new Loop2("Thread 2")).start();
        new Thread(new Loop2("Thread 3")).start();
/*        //oder so
        Loop1 r1 = new Loop1("Thread 1");
        Thread t1 = new Thread(r1);        
        Loop1 r2 = new Loop1("Thread 2");
        Thread t2 = new Thread(r2);
        Loop1 r3 = new Loop1("Thread 3");
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start(); 
        */
    }
}
