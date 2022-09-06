import java.util.*;

public class hilos {
    public static volatile int x = 0;
    public static volatile long id1, id2;

    public static void main(String[] args) throws InterruptedException{ 
        System.out.println("El nombre de hilo es: " + Thread.currentThread().getName());
        Thread t1 = new Thread(new hilos().new Runable());

        id1 = t1.getId();

        System.out.println(id1);
        

        System.out.println("El nombre de hilo es: " + Thread.currentThread().getName());
        Thread t2 = new Thread(new hilos().new Runable());
        
        id2 = t2.getId();
        System.out.println(id2);

        //Iniciamos los hilos
        t1.start();
        t2.start();

        Scanner sc = new Scanner(System.in);

        //System.out.print("Ingrese el valor de n: ");
//
        //int n = sc.nextInt();

        for (int i = 0; i < 10000; i++) {
            modifica(t1.getId());
            modifica(t2.getId());
        }
        sc.close();
        t1.join();
        System.out.println(x);
        
    }

    public class Runable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + ", executing run() method");
        }
    }

    public static void modifica(long id3) {
        if (id1 == id3) {
            x++;
            //System.out.println("Incremento: " + x);
        } else if (id2 == id3) {
            x--;
            //System.out.println("Decremento: " + x);

        }
    }

}