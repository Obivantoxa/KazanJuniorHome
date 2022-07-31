package lesson16;

public class Main {
    public static void main(String[] args) {

//        MyThread myThread = new MyThread();
//        myThread.start();
        Thread myTre = new Thread(new MyThread());
        myTre.start();
        myTre.setName("Toha");
        //myTre.setDaemon(true);

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
