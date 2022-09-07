public class Hilos {

  public static int x = 0;

  public static void main(String[] args) {
    //System.out.println("Main thread is- "+ Thread.currentThread().getName());
    Thread t1 = new Thread(new Hilos().new RunnableImpl());
    t1.start();

    Thread t2 = new Thread(new Hilos().new RunnableImpl());
    t2.start();
  }

  public synchronized void modifica() {
    System.out.println(
      Thread.currentThread().getName() + ", executing run() method!"
    );
    //System.out.println("Me estoy ejecutando");
    for (int i = 0; i < 1000; i++) {
      if (Thread.currentThread().getName().equals("Thread-0")) {
        x++;
      } else if (Thread.currentThread().getName().equals("Thread-1")) {
        x--;
      }
      //System.out.println(x);
    }
  }

  private class RunnableImpl implements Runnable {

    public void run() {
      modifica();
      System.out.println(x);
    }
  }
}
