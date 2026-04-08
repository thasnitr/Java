class FibonacciThread implements Runnable 
{
 int n;
 public FibonacciThread(int n)
 {
  this.n = n;
 }
 public void run() 
 {
  int a = 0, b = 1;
  System.out.println("Fibonacci Series:");
  for (int i = 0; i < n; i++)
  {
   System.out.print(a + " ");
   int next = a + b;
   a = b;
   b = next;
  }
  System.out.println();
 }
}
class EvenNumberThread implements Runnable 
{
  int start, end;
  public EvenNumberThread(int start, int end) 
  {
   this.start = start;
   this.end = end;
  }
  public void run() 
  {
    System.out.println("Even Numbers:");
    for (int i = start; i <= end; i++)
    {
     if (i % 2 == 0) 
     {
      System.out.print(i + " ");
     }
    }
    System.out.println();
  }
}

public class FibThreadExample
{
  public static void main(String[] args) 
  {
        FibonacciThread fibTask = new FibonacciThread(10);
        EvenNumberThread evenTask = new EvenNumberThread(1, 20);

        Thread t1 = new Thread(fibTask);
        Thread t2 = new Thread(evenTask);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
    } 
  }
