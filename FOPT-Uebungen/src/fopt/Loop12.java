package fopt;

public class Loop12
{    
    private static void execute(String myName)
    {
        for(int i=1; i<=100;i++)
        {
            System.out.println(myName + " (" + i + ")");
        }
    }

    public static void main(String[] args)
    {
        new Thread(() -> execute ("Fred 1")).start();
        new Thread(() -> execute ("Fred 2")).start();
        new Thread(() -> execute ("Fred 3")).start();
    }
}

//Lambda Runnable
//Runnable task2 = () -> { System.out.println("Task #2 is running"); };

//start the thread 
//new Thread(task2).start();
