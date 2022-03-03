public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        MyFirstThread myFirstThread1 = new MyFirstThread();
        MyFirstThread myFirstThread2 = new MyFirstThread();
        myFirstThread1.start();
        myFirstThread2.start();
    }
}
