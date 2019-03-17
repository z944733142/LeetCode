package Algorithms;

public class Sleep
{
    public static void main(String[] args)
    {
        int[] ts = {2,2,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,22,2,2,2,2,1,1,1,1,1};
        thread(ts);
    }

    private static void thread(int[] ts)
    {
        for (int i = 0; i < ts.length;i++)
        {
            new SleepSortThread(ts[i]).start();
        }
    }
}

class SleepSortThread extends Thread
{
    int t = 0;
    public SleepSortThread(int t)
    {
        this.t = t;
    }

    @Override
    public void run()
    {
        try
        {
            sleep(t * 10);
            System.out.println(t);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}