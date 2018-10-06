package fopt;

public class Loop12 implements Runnable
{
    private String myName;
    
    public Loop2(String name)
    {
        myName = name;
    }
    
    public void run()
    {
        for(int i=1; i<=100;i++)
        {
            new Thread(() -> System.out.println(myName + " (" + i + ")")).start();
            //System.out.println(myName + " (" + i + ")");
        }
    }

    public static void main(String[] args)
    {
        new Thread(new Loop2("Thread 1")).start();
        new Thread(new Loop2("Thread 2")).start();
        new Thread(new Loop2("Thread 3")).start();
    }
}

//Lambda Runnable
//Runnable task2 = () -> { System.out.println("Task #2 is running"); };

//start the thread 
//new Thread(task2).start();
