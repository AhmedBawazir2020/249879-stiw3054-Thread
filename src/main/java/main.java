
    public class main {

        public static void main(String[] args) {

                System.out.println("Hello World");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());

            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            t1.start();
            t2.start();

            Reunab Rable = new Reunab();
            Thread t3 = new Thread(Rable);
            t3.start();



        }

    }

    class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("Hello Thread "+ Thread.currentThread().getName());

        }

    }

    class Reunab implements Runnable{
        @Override
        public void run() {
            System.out.println("Hi Runnable "+Thread.currentThread().getName());
        }
    }

